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
    // display all product
    public static final String SELECT_PRODUCT = "SELECT * FROM product;";
    //update peoduct
    public static final String UPDATE_PRODUCT = "UPDATE Product SET productName=?, img=?, priceProduct=?, typeProductId=?, sizeId=?, trademarkId=?, quantity=?, dateAdded=?, describe_P=? WHERE productId=?";
    // ------------------------------------------------------------------------------
    //delete product
    public static final String DELETE_PRODUCT = "DELETE FROM Product WHERE productId=?";
    //add product
    public static final String ADD_PRODUCT = "INSERT INTO product (productName, img, priceProduct, typeProductId, sizeId, trademarkId, quantity, dateAdded, describe_P) "
            + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

    //getProductById
    public static final String GET_PRODUCT_BY_ID = "SELECT * FROM product WHERE productId = ?";
}
