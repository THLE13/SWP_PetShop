package model.utils;

// Chỗ cho query qua bên DB
public class PShopQuery {

    // --------------------------------------- For Customer, Employee, Admin
    // Login Part
    public static final String LOGIN = "select * from customer where username = ? and password = ?";
    // Register Part
    public static final String REGISTER = "insert into customer(customerName, customerDob, username,password, email, phoneNumber, address, img_ava, description_C, typeCustomerId)"
            + " values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
    // Select By Gmail
    public static final String BY_EMAIL = "SELECT * FROM customer WHERE email = ?;";
    
    // Update PassWord By Email
    public static final String UPDATE_PW_EMAIL = "UPDATE customer SET password = ? where email = ?;";
    // Display All Customer
    public static final String SELECT_CUSTOMER = "SELECT * FROM customer;";
    // ------------------------------------------------------------------------------
    // --------------------------------------- For Product
    // ------------------------------------------------------------------------------
}
