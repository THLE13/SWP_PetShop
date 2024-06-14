package java.model.entity;

public class BillDetail {
    private int billDetailId;
    private int productId;
    private int quantity;
    private int billId;
    private double priceBillDetail;

    public BillDetail(int billDetailId, int productId, int quantity, int billId, double priceBillDetail) {
        this.billDetailId = billDetailId;
        this.productId = productId;
        this.quantity = quantity;
        this.billId = billId;
        this.priceBillDetail = priceBillDetail;
    }

    public BillDetail() {

    }

    public int getBillDetailId() {
        return billDetailId;
    }

    public void setBillDetailId(int billDetailId) {
        this.billDetailId = billDetailId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public double getPriceBillDetail() {
        return priceBillDetail;
    }

    public void setPriceBillDetail(double priceBillDetail) {
        this.priceBillDetail = priceBillDetail;
    }

    @Override
    public String toString() {
        return "BillDetail [billDetailId=" + billDetailId + ", productId=" + productId + ", quantity=" + quantity
                + ", billId=" + billId + ", priceBillDetail=" + priceBillDetail + "]";
    }
}
