package model.entity;

import java.util.Date;

public class Product {

    private int productId;
    private String productName;
    private String imgProduct;
    private double priceProduct;
    private int typeProductId;
    private int sizeId;
    private int trademarkId;
    private int quantity;
    private Date dateAdded;
    private String describe_product;

    public Product() {
    }

    public Product(int productId, String productName, String imgProduct, double priceProduct, int typeProductId, int sizeId, int trademarkId, int quantity, Date dateAdded, String describe_product) {
        this.productId = productId;
        this.productName = productName;
        this.imgProduct = imgProduct;
        this.priceProduct = priceProduct;
        this.typeProductId = typeProductId;
        this.sizeId = sizeId;
        this.trademarkId = trademarkId;
        this.quantity = quantity;
        this.dateAdded = dateAdded;
        this.describe_product = describe_product;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getImgProduct() {
        return imgProduct;
    }

    public void setImgProduct(String imgProduct) {
        this.imgProduct = imgProduct;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(double priceProduct) {
        this.priceProduct = priceProduct;
    }

    public int getTypeProductId() {
        return typeProductId;
    }

    public void setTypeProductId(int typeProductId) {
        this.typeProductId = typeProductId;
    }

    public int getSizeId() {
        return sizeId;
    }

    public void setSizeId(int sizeId) {
        this.sizeId = sizeId;
    }

    public int getTrademarkId() {
        return trademarkId;
    }

    public void setTrademarkId(int trademarkId) {
        this.trademarkId = trademarkId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public String getDescribe_product() {
        return describe_product;
    }

    public void setDescribe_product(String describe_product) {
        this.describe_product = describe_product;
    }

    @Override
    public String toString() {
        return "Product{" + "productId=" + productId + ", productName=" + productName + ", imgProduct=" + imgProduct + ", priceProduct=" + priceProduct + ", typeProductId=" + typeProductId + ", sizeId=" + sizeId + ", trademarkId=" + trademarkId + ", quantity=" + quantity + ", dateAdded=" + dateAdded + ", describe_product=" + describe_product + '}';
    }

}
