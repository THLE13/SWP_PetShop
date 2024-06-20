/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import model.dao.adminProduct;
import model.entity.Product;

/**
 *
 * @author CongThanh
 */
//@WebServlet(name = "AdminProductServlet", urlPatterns = {"/adminProduct", "/editProduct", "/addProduct", "/deleteProduct", "/updateProduct"})
public class AdminProductServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String urlParth = request.getServletPath();
        switch (urlParth) {
            case "/adminProduct":
                listProduct(request, response);
                break;
            case "/loadInforProduct":
                getProductById(request, response);
                break;
            default:
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String urlParth = request.getServletPath();
        System.out.println("ủlsadsdas" + urlParth);
        switch (urlParth) {
            case "/addProduct":
                addProduct(request, response);
                break;
            case "/deleteProduct":
                deleteProduct(request, response);
                break;
            case "/editProduct":
                updateProduct(request, response);
                break;
            default:
                break;
        }
    }

    private void listProduct(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        adminProduct productDao = new adminProduct();
        List<Product> products = productDao.getAllProducts();

        request.setAttribute("products", products);
        request.getRequestDispatcher("pages/admin/product.jsp").forward(request, response);
    }

    protected void addProduct(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve parameters from the form submission
        String productName = request.getParameter("productName");
        String imgProduct = request.getParameter("imgProduct");
        double priceProduct = Double.parseDouble(request.getParameter("priceProduct"));
        int typeProductId = Integer.parseInt(request.getParameter("typeProductId"));
        int sizeId = Integer.parseInt(request.getParameter("sizeId"));
        int trademarkId = Integer.parseInt(request.getParameter("trademarkId"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        String describeProduct = request.getParameter("describe_product");
        // Set Date
        java.sql.Date dateAdded = java.sql.Date.valueOf(request.getParameter("dateAdded"));

        // Create a Product object
        Product product = new Product();
        product.setProductName(productName);
        product.setImgProduct(imgProduct);
        product.setPriceProduct(priceProduct);
        product.setTypeProductId(typeProductId);
        product.setSizeId(sizeId);
        product.setTrademarkId(trademarkId);
        product.setQuantity(quantity);
        product.setDateAdded(dateAdded);
        product.setDescribe_product(describeProduct);

        // Call DAO to add product to database
        adminProduct productDao = new adminProduct();
        productDao.addProduct(product);

        // Redirect back to product list page after adding
        response.sendRedirect(request.getContextPath() + "/adminProduct");

    }

    //delete Product
    private void deleteProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int productId = Integer.parseInt(request.getParameter("productId"));
        adminProduct productDao = new adminProduct();
        productDao.deleteProduct(productId);
        response.sendRedirect(request.getContextPath() + "/adminProduct");
    }

    //getProductById 
    private void getProductById(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int productId = Integer.parseInt(request.getParameter("productId"));
        adminProduct adProduct = new adminProduct();
        Product product = adProduct.getProductById(productId);
        request.setAttribute("product", product);
        request.getRequestDispatcher("pages/admin/edit.jsp").forward(request, response);

    }

//   updateProduct
    private void updateProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int productId = Integer.parseInt(request.getParameter("productId"));
        String productName = request.getParameter("productName");
        String imgProduct = request.getParameter("imgProduct");
        double priceProduct = Double.parseDouble(request.getParameter("priceProduct"));
        int typeProductId = Integer.parseInt(request.getParameter("typeProductId"));
        int sizeId = Integer.parseInt(request.getParameter("sizeId"));
        int trademarkId = Integer.parseInt(request.getParameter("trademarkId"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        String describeProduct = request.getParameter("describe_product");
        Date dateAdded = new Date(); // Assuming the current date for simplicity

        Product product = new Product();
        product.setProductId(productId);
        product.setProductName(productName);
        product.setImgProduct(imgProduct);
        product.setPriceProduct(priceProduct);
        product.setTypeProductId(typeProductId);
        product.setSizeId(sizeId);
        product.setTrademarkId(trademarkId);
        product.setQuantity(quantity);
        product.setDateAdded(dateAdded);
        product.setDescribe_product(describeProduct);

        adminProduct adProduct = new adminProduct();

        adProduct.updateProduct(product);
        System.out.println("Updating product with ID: " + productId);
        System.out.println("Updated product: " + product.toString());
        response.sendRedirect(request.getContextPath() + "/adminProduct");

    }

}
