package model.entity;

import java.util.Date;

public class Customer {

    private int customerId;
    private String customerName;
    private Date customerDob;
    private String userName;
    private String passWord;
    private String email;
    private String phoneNumber;
    private String address;
    private String img_ava;
    private String description;
    private int typeCustomerId;

    public Customer(String customerName, String userName, String passWord) {
        this.customerName = customerName;
        this.userName = userName;
        this.passWord = passWord;
        this.customerDob = new java.sql.Date(System.currentTimeMillis());
        this.email = "Your Email";
        this.phoneNumber = "Your PhoneNumber";
        this.address = "YourAddress";
        this.img_ava = "Your Ava";
        this.description = "About You";
        this.typeCustomerId = 1;
    }

    public Customer() {
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Date getCustomerDob() {
        return customerDob;
    }

    public void setCustomerDob(Date customerDob) {
        this.customerDob = customerDob;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImg_ava() {
        return img_ava;
    }

    public void setImg_ava(String img_ava) {
        this.img_ava = img_ava;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTypeCustomerId() {
        return typeCustomerId;
    }

    public void setTypeCustomerId(int typeCustomerId) {
        this.typeCustomerId = typeCustomerId;
    }

    @Override
    public String toString() {
        return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerDob=" + customerDob
                + ", userName=" + userName + ", passWord=" + passWord + ", email=" + email + ", phoneNumber="
                + phoneNumber + ", address=" + address + ", img_ava=" + img_ava + ", description=" + description
                + ", typeCustomerId=" + typeCustomerId + "]";
    }
}
