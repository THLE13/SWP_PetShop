package java.model.entity;

import java.util.Date;

public class Bill {
    private int billSaleId;
    private Date dateTime;
    private int customerId;
    private String status;
    private String voucherCode;
    private double vat;
    private int transportId;
    private int paymentId;
    private int employeeId;

    public Bill(int billSaleId, Date dateTime, int customerId, String status, String voucherCode, double vat,
            int transportId, int paymentId, int employeeId) {
        this.billSaleId = billSaleId;
        this.dateTime = dateTime;
        this.customerId = customerId;
        this.status = status;
        this.voucherCode = voucherCode;
        this.vat = vat;
        this.transportId = transportId;
        this.paymentId = paymentId;
        this.employeeId = employeeId;
    }

    public Bill() {

    }

    public int getBillSaleId() {
        return billSaleId;
    }

    public void setBillSaleId(int billSaleId) {
        this.billSaleId = billSaleId;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getVoucherCode() {
        return voucherCode;
    }

    public void setVoucherCode(String voucherCode) {
        this.voucherCode = voucherCode;
    }

    public double getVat() {
        return vat;
    }

    public void setVat(double vat) {
        this.vat = vat;
    }

    public int getTransportId() {
        return transportId;
    }

    public void setTransportId(int transportId) {
        this.transportId = transportId;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        return "Bill [billSaleId=" + billSaleId + ", dateTime=" + dateTime + ", customerId=" + customerId + ", status="
                + status + ", voucherCode=" + voucherCode + ", vat=" + vat + ", transportId=" + transportId
                + ", paymentId=" + paymentId + ", employeeId=" + employeeId + "]";
    }

}
