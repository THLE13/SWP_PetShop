package java.model.entity;

public class Size {
    private int sizeId;
    private String sizeName;
    private double weight;

    public Size(int sizeId, String sizeName, double weight) {
        this.sizeId = sizeId;
        this.sizeName = sizeName;
        this.weight = weight;
    }

    public Size() {
    }

    public int getSizeId() {
        return sizeId;
    }

    public void setSizeId(int sizeId) {
        this.sizeId = sizeId;
    }

    public String getSizeName() {
        return sizeName;
    }

    public void setSizeName(String sizeName) {
        this.sizeName = sizeName;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Size [sizeId=" + sizeId + ", sizeName=" + sizeName + ", weight=" + weight + "]";
    }

}
