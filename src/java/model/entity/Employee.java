package java.model.entity;

import java.util.Date;

public class Employee {
    private int employeeId;
    private String employeeName;
    private Date employeeDate;
    private String userName;
    private String passWord;
    private String phoneNumber;
    private String email;
    private String imgAva;
    private String desccription;
    private int roleId;

    public Employee(int employeeId, String employeeName, Date employeeDate, String userName, String passWord,
            String phoneNumber, String email, String imgAva, String desccription, int roleId) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeDate = employeeDate;
        this.userName = userName;
        this.passWord = passWord;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.imgAva = imgAva;
        this.desccription = desccription;
        this.roleId = roleId;
    }

    public Employee() {
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Date getEmployeeDate() {
        return employeeDate;
    }

    public void setEmployeeDate(Date employeeDate) {
        this.employeeDate = employeeDate;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImgAva() {
        return imgAva;
    }

    public void setImgAva(String imgAva) {
        this.imgAva = imgAva;
    }

    public String getDesccription() {
        return desccription;
    }

    public void setDesccription(String desccription) {
        this.desccription = desccription;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeDate="
                + employeeDate + ", userName=" + userName + ", passWord=" + passWord + ", phoneNumber=" + phoneNumber
                + ", email=" + email + ", imgAva=" + imgAva + ", desccription=" + desccription + ", roleId=" + roleId
                + "]";
    }

}
