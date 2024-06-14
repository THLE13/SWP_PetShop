package java.model.entity;

public class Rating {
    private int ratingId;
    private int productId;
    private int customerId;
    private int startQuantity;
    private String content;

    public Rating(int ratingId, int productId, int customerId, int startQuantity, String content) {
        this.ratingId = ratingId;
        this.productId = productId;
        this.customerId = customerId;
        this.startQuantity = startQuantity;
        this.content = content;
    }

    public Rating() {

    }

    public int getRatingId() {
        return ratingId;
    }

    public void setRatingId(int ratingId) {
        this.ratingId = ratingId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getStartQuantity() {
        return startQuantity;
    }

    public void setStartQuantity(int startQuantity) {
        this.startQuantity = startQuantity;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Rating [ratingId=" + ratingId + ", productId=" + productId + ", customerId=" + customerId
                + ", startQuantity=" + startQuantity + ", content=" + content + "]";
    }

}
