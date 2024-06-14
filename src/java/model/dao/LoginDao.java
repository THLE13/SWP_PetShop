/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.connection.DBConnection;
import model.entity.Customer;
import model.utils.PShopQuery;

/**
 *
 * @author CongThanh
 */
public class LoginDao {
private DBConnection db = DBConnection.getInstance();

//     login
    public Customer checkLogin(String userName, String passWord) {
        Customer cus = null;
        try {
            Connection con = db.openConnection();
            PreparedStatement pst = con.prepareStatement(PShopQuery.LOGIN);
            pst.setString(1, userName);
            pst.setString(2, passWord);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                String customerName = rs.getString("customerName");
                cus = new Customer(customerName, userName, passWord);
            }
            pst.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return cus;
    }

//      register
    public Customer registerCustomer(Customer cus) {

        try {
            Connection con = db.openConnection();
            PreparedStatement pst = con.prepareStatement(PShopQuery.REGISTER);
            pst.setString(1, cus.getCustomerName());
            pst.setDate(2, new java.sql.Date(cus.getCustomerDob().getTime()));
            pst.setString(3, cus.getUserName());
            pst.setString(4, cus.getPassWord());
            pst.setString(5, cus.getEmail());
            pst.setString(6, cus.getPhoneNumber());
            pst.setString(7, cus.getAddress());
            pst.setString(8, cus.getImg_ava());
            pst.setString(9, cus.getDescription());
            pst.setInt(10, cus.getTypeCustomerId());
            pst.executeUpdate();
            pst.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return cus;
    }
    
    
    // List All User
     public List<Customer> getAllCustomers() {
        List<Customer> customers = new ArrayList<>();
        try {
            Connection connection = db.openConnection();
            PreparedStatement pt = connection.prepareStatement(PShopQuery.SELECT_CUSTOMER);
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
    // Get Account By Email
   public Customer getAccountByEmail(String email) {
        try {
            Connection con = db.openConnection();
            PreparedStatement st = con.prepareStatement(PShopQuery.BY_EMAIL);
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
            Connection con = db.openConnection();
            ptm = con.prepareStatement(PShopQuery.UPDATE_PW_EMAIL);
            ptm.setString(1, password);
            ptm.setString(2, email);
            ptm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           
            try {
                if (ptm != null) {
                    ptm.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

}
