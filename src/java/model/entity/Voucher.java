package java.model.entity;

public class Voucher {
    private String code;
    private double sale;
    private String regulationNo;

    public Voucher(String code, double sale, String regulationNo) {
        this.code = code;
        this.sale = sale;
        this.regulationNo = regulationNo;
    }

    public Voucher() {

    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getSale() {
        return sale;
    }

    public void setSale(double sale) {
        this.sale = sale;
    }

    public String getRegulationNo() {
        return regulationNo;
    }

    public void setRegulationNo(String regulationNo) {
        this.regulationNo = regulationNo;
    }

    @Override
    public String toString() {
        return "Voucher [code=" + code + ", sale=" + sale + ", regulationNo=" + regulationNo + "]";
    }

}
