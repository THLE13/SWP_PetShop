package java.model.entity;

public class TypeProduct {
    private int typeProductId;
    private String typeProductName;
    private String describeType;

    public TypeProduct(int typeProductId, String typeProductName, String describeType) {
        this.typeProductId = typeProductId;
        this.typeProductName = typeProductName;
        this.describeType = describeType;
    }

    public TypeProduct() {
    }

    public int getTypeProductId() {
        return typeProductId;
    }

    public void setTypeProductId(int typeProductId) {
        this.typeProductId = typeProductId;
    }

    public String getTypeProductName() {
        return typeProductName;
    }

    public void setTypeProductName(String typeProductName) {
        this.typeProductName = typeProductName;
    }

    public String getDescribeType() {
        return describeType;
    }

    public void setDescribeType(String describeType) {
        this.describeType = describeType;
    }

    @Override
    public String toString() {
        return "TypeProduct [typeProductId=" + typeProductId + ", typeProductName=" + typeProductName
                + ", describeType=" + describeType + "]";
    }
}
