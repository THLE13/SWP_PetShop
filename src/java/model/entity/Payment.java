package java.model.entity;

public class Payment {
    private int paymentId;
    private String typePayment;

    public Payment(int paymentId, String typePayment) {
        this.paymentId = paymentId;
        this.typePayment = typePayment;
    }

    public Payment() {

    }

    public int getPaymentId() {
        return paymentId;
    }

    public String getTypePayment() {
        return typePayment;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public void setTypePayment(String typePayment) {
        this.typePayment = typePayment;
    }

    @Override
    public String toString() {
        return "Payment [paymentId=" + paymentId + ", typePayment=" + typePayment + "]";
    }

}
