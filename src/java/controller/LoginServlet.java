/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Random;
import model.dao.LoginDao;
import model.entity.Customer;
import model.entity.Email;

/**
 *
 * @author longle2507
 */
public class LoginServlet extends HttpServlet {

    private LoginDao loginDao = new LoginDao();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String urlPath = request.getServletPath();
        System.out.println(urlPath);
        switch (urlPath) {
            case "/logout":
//                logoutMethod(request, response);
                break;
            case "/register-cus":
                showRegisterPage(request, response);
                break;
            default:
                break;
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String urlPath = request.getServletPath();
        System.out.println(urlPath);
        switch (urlPath) {
            case "/register-cus":
                registerPart(request, response);
                break;
            case "/login":
                loginMethod(request, response);
                break;
            case "/change":
                changeEmail(request, response);
                break;
            case "/forgetPassWord":
                forgetPassWord(request, response);
                break;
            case "/verify":
                verifyEmail(request, response);
                break;
            case "/reset_password":
                resetPassWord(request, response);
                break;
            default:
                break;
        }
    }

    public void showRegisterPage(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
        dispatcher.forward(request, response);
    }

    private void loginMethod(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String userName = request.getParameter("userName");
        String passWord = request.getParameter("passWord");
        Customer cus = loginDao.checkLogin(userName, passWord);
        if (cus != null) {
            HttpSession session = request.getSession();
            session.setAttribute("seeUserName", cus.getUserName());
            System.out.println(cus.getUserName());
            response.sendRedirect("index.jsp");
        } else {
            System.out.println("Error!");
            response.sendRedirect("login.jsp");
        }
    }

    private void registerPart(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String customerName = request.getParameter("customerName");
        String userName = request.getParameter("userName");
        String passWord = request.getParameter("passWord");
        String confirm = request.getParameter("confirm-password");

        if (passWord.equals(confirm)) {
            Customer cus = new Customer(customerName, userName, passWord);
            loginDao.registerCustomer(cus);
            System.out.println("Add Successful");
            response.sendRedirect("index.jsp");
        } else {
            System.out.println("Error!");
            request.setAttribute("errorMsg", "Confirm doesn't match with passWord!");
            response.sendRedirect("components/login.jsp");
        }
    }

    // Reset PassWord
    private void resetPassWord(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String newPass = request.getParameter("password");
        String comfirmPass = request.getParameter("confirmPassword");

        System.out.println(email);
        if (!isValidPassword(newPass) && !isValidPassword(comfirmPass)) {
            String msg = "Password must be at least 8 characters long, contain at least one uppercase letter, one digit, and one special character.";
            request.setAttribute("msg", msg);
            request.getRequestDispatcher("components/reset_password.jsp").forward(request, response);
            return;
        }

        if (newPass.equals(comfirmPass) && newPass != null) {
            loginDao.updatePasswordByEmail(email, newPass);
            response.sendRedirect("components/login.jsp");
        } else {
            request.setAttribute("msg", "Password doesn't match!!");
            request.getRequestDispatcher("components/reset_password.jsp").forward(request, response);
        }
    }

    // Change Email
    private void changeEmail(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String oldPass = request.getParameter("oldPassword");
        String newPass = request.getParameter("newPassword");
        String confimpass = request.getParameter("confirmPassword");
        String email1 = request.getParameter("email");
        Customer customer = loginDao.getAccountByEmail(email1);
        String msg = "";

        if (!isValidPassword(newPass) && !isValidPassword(confimpass)) {
            msg = "Password must be at least 8 characters long, contain at least one uppercase letter, one digit, and one special character.";
            request.setAttribute("msg", msg);
            request.getRequestDispatcher("components/change_password.jsp").forward(request, response);
            return;
        }
        if (customer != null && email1.equals(customer.getEmail()) && oldPass.equals(customer.getPassWord())) {
            loginDao.updatePasswordByEmail(email1, newPass);
            if (newPass.equals(confimpass)) {
                msg = "Change password success";
                request.setAttribute("success", msg);
                response.sendRedirect("components/login.jsp");

            } else {
                request.setAttribute("msg", "New password doesn't match");
                request.getRequestDispatcher("components/change_password.jsp").forward(request, response);
            }
        } else {
            request.setAttribute("msg", "Email or password doesn't match");
            request.getRequestDispatcher("components/change_password.jsp").forward(request, response);
        }
    }

    // Check PassWord
    private boolean isValidPassword(String password) {
        if (password.length() < 8) {
            return false;
        }

        boolean hasUppercase = !password.equals(password.toLowerCase());
        boolean hasDigit = password.matches(".*\\d.*");
        boolean hasSpecialChar = !password.matches("[A-Za-z0-9 ]*");

        return hasUppercase && hasDigit && hasSpecialChar;
    }

    // Forget PassWord
    private void forgetPassWord(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        Customer customer = loginDao.getAccountByEmail(email);
        String msg = "";

        Random random = new Random();
        HttpSession session = request.getSession();
        int code = random.nextInt(10000);
        if (customer != null && email.equals(customer.getEmail())) {

            // Send email with the old password to the user
            String emailContent = "<h3>Forget Password</h3>"
                    + "<img src=\"https://paddy.vn/cdn/shop/files/khuyen-mai-pate-royal-canin-30_1880_x_720_px.png?v=1713266278&width=1880\" alt=\"PetShop\" style=\"max-width: 50%; height: 50%;\">"
                    + "<p>Verify code reset password is: <strong>" + code + "</strong></p>"
                    + "<p>Please remember to change your password after logging in for security reasons.</p>"
                    + "<p>Best regards,"
                    + "<p> The PetShop Team</p>";
            Email emailSender = new Email();
            boolean sent = emailSender.sendEmail(email, emailContent, "Forget Password - PetShop");
            if (sent) {
                System.out.println(code);
                session.setAttribute("verifyCode", code);
                session.setAttribute("email", email);
                request.getRequestDispatcher("components/verify_email.jsp").forward(request, response);
            } else {
                request.setAttribute("msg", "Failed to send the old password. Please try again later.");
                request.getRequestDispatcher("components/forget_password.jsp").forward(request, response);
            }
        } else {
            request.setAttribute("msg", "Email hasn't been registered.");
            request.getRequestDispatcher("components/forget_password.jsp").forward(request, response);
        }
    }

    //Verify
    private void verifyEmail(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String code = request.getParameter("code");
        String codeEmail = request.getParameter("verifyCode");
        String email = request.getParameter("email");
        HttpSession session = request.getSession();
        if (code.equals(codeEmail)) {
            System.out.println("1");
            System.out.println(code);
            System.out.println(codeEmail);
            session.setAttribute("email", email);
            request.getRequestDispatcher("components/reset_password.jsp").forward(request, response);
        } else {
            System.out.println("2");
            System.out.println(code);
            System.out.println(codeEmail);
            System.out.println(email);
            request.setAttribute("msg", "Code doesn't match!");
            request.getRequestDispatcher("components/verify_email.jsp").forward(request, response);
        }
    }

    // Login With Google
}
