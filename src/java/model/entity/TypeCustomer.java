package java.model.entity;

public class TypeCustomer {
    private int typeCustomerId;
    private String typecustomerName;

    public TypeCustomer(int typeCustomerId, String typecustomerName) {
        this.typeCustomerId = typeCustomerId;
        this.typecustomerName = typecustomerName;
    }

    public TypeCustomer() {

    }

    public int getTypeCustomerId() {
        return typeCustomerId;
    }

    public void setTypeCustomerId(int typeCustomerId) {
        this.typeCustomerId = typeCustomerId;
    }

    public String getTypecustomerName() {
        return typecustomerName;
    }

    public void setTypecustomerName(String typecustomerName) {
        this.typecustomerName = typecustomerName;
    }

    @Override
    public String toString() {
        return "TypeCustomer [typeCustomerId=" + typeCustomerId + ", typecustomerName=" + typecustomerName + "]";
    }

}
