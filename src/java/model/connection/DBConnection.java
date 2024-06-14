/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.connection;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import model.entity.Customer;

/**
 *
 * @author longle2507
 */
public class DBConnection extends BaseConnection {
    // Method to retrieve all customers

    private static DBConnection instance;

    public static DBConnection getInstance() {
        if (instance == null) {
            instance = new DBConnection();
        }

        return instance;
    }

    public static Connection openConnection() throws Exception {
        Class.forName(DRIVER_NAME);
        Connection con = DriverManager.getConnection(URL, USER_NAME, PASS_WORD);

        return con;
    }

    public static void closeConnection(Connection con, PreparedStatement pst) throws SQLException {
        try {
            if (con != null) {
                con.close();
            }
            pst.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public static void closeConnection(Connection con, PreparedStatement pst, ResultSet rs) throws SQLException {
        try {
            con.close();
            pst.close();
            rs.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    public List<Customer> getAllCustomers() {
        List<Customer> customers = new ArrayList<>();
        String sql = "SELECT * FROM customer";
        try {
            PreparedStatement pt = connection.prepareStatement(sql);
            ResultSet rs = pt.executeQuery();
            while (rs.next()) {
                Customer customer = new Customer(); // Create a new Customer object
                customer.setCustomerId(rs.getInt("customerId"));
                customer.setCustomerName(rs.getString("customerName"));
                customer.setCustomerDob(rs.getDate("customerDob")); // Use getDate method
                customer.setUserName(rs.getString("username"));
                customer.setPassWord(rs.getString("password"));
                customer.setEmail(rs.getString("email"));
                customer.setPhoneNumber(rs.getString("phoneNumber"));
                customer.setAddress(rs.getString("address"));
                customer.setImg_ava(rs.getString("img_ava"));
                customer.setDescription(rs.getString("description_C"));
                customer.setTypeCustomerId(rs.getInt("typecustomerId"));
                customers.add(customer);
            }
            rs.close();
            pt.close();
        } catch (Exception e) {
            System.out.println("Error retrieving customers: " + e.getMessage());
        }
        return customers;
    }

    public Customer getAccountByEmail(String email) {
        String sql = "SELECT * FROM customer WHERE email = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, email);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Customer c = new Customer();
                c.setCustomerId(rs.getInt("customerId"));
                c.setCustomerName(rs.getString("customerName"));
                c.setCustomerDob(rs.getDate("customerDob"));
                c.setUserName(rs.getString("username"));
                c.setPassWord(rs.getString("password"));
                c.setEmail(rs.getString("email"));
                c.setPhoneNumber(rs.getString("phoneNumber"));
                c.setAddress(rs.getString("address"));
                c.setImg_ava(rs.getString("img_ava"));
                c.setDescription(rs.getString("description_C"));
                c.setTypeCustomerId(rs.getInt("typecustomerId"));
                return c;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public void updatePasswordByEmail(String email, String password) {
        PreparedStatement ptm = null;
        try {
            ptm = connection.prepareStatement("UPDATE [dbo].[customer]\n"
                    + "   SET [password] = ?\n"
                    + "    WHERE [email] = ?");
            ptm.setString(1, password);
            ptm.setString(2, email);
            ptm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Đóng tài nguyên
            try {
                if (ptm != null) {
                    ptm.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
    
    

    public static void main(String[] args) {
        DBConnection dbConnection = new DBConnection();
//        // Retrieve and display all customers
//        List<Customer> customers = dbConnection.getAllCustomers();
//        if (customers.isEmpty()) {
//            System.out.println("No customers found.");
//        } else {
//            System.out.println("Customer list:");
//            for (Customer customer : customers) {
//                System.out.println("ID: " + customer.getCustomerId());
//                System.out.println("Name: " + customer.getCustomerName());
//                System.out.println("DOB: " + customer.getCustomerDob());
//                System.out.println("Username: " + customer.getUserName());
//                System.out.println("Email: " + customer.getEmail());
//                System.out.println("Phone: " + customer.getPhoneNumber());
//                System.out.println("Address: " + customer.getAddress());
//                System.out.println("Image: " + customer.getImg_ava());
//                System.out.println("Description: " + customer.getDescription());
//                System.out.println("Type ID: " + customer.getTypeCustomerId());
//                System.out.println("------------------------------------");
//            }
//        }

// lay account = email
        Customer customer = dbConnection.getAccountByEmail("johndoe@example.com");
          if (customer != null) {
                System.out.println("Thông tin của khách hàng:");
                System.out.println("ID: " + customer.getCustomerId());
                System.out.println("Tên: " + customer.getCustomerName());
                System.out.println("Email: " + customer.getEmail());
                System.out.println("pass: " + customer.getPassWord());
                // In các thông tin khác tùy ý
            } else {
                System.out.println("Không tìm thấy khách hàng với email " + "johndoe@example.com");
            }
        // Thực hiện cập nhật mật khẩu cho email cụ thể
//        String emailToUpdate = "johndoe@example.com";
//        String newPassword = "111";
//        dbConnection.updatePasswordByEmail(emailToUpdate, newPassword);
//
//        // Kiểm tra xem mật khẩu đã được cập nhật thành công hay không
//        Customer updatedCustomer = dbConnection.getAccountByEmail(emailToUpdate);
//        if (updatedCustomer != null) {
//            System.out.println("Mật khẩu của khách hàng " + emailToUpdate + " đã được cập nhật thành công.");
//        } else {
//            System.out.println("Không tìm thấy khách hàng với email " + emailToUpdate);
//        }
    }
}
