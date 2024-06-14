package java.model.entity;

public class TradeMark {
    private int trademarkId;
    private String tradeMarkName;
    private String logo;
    private String descriptionTrademark;

    public TradeMark(int trademarkId, String tradeMarkName, String logo, String descriptionTrademark) {
        this.trademarkId = trademarkId;
        this.tradeMarkName = tradeMarkName;
        this.logo = logo;
        this.descriptionTrademark = descriptionTrademark;
    }

    public TradeMark() {
    }

    public int getTrademarkId() {
        return trademarkId;
    }

    public void setTrademarkId(int trademarkId) {
        this.trademarkId = trademarkId;
    }

    public String getTradeMarkName() {
        return tradeMarkName;
    }

    public void setTradeMarkName(String tradeMarkName) {
        this.tradeMarkName = tradeMarkName;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getDescriptionTrademark() {
        return descriptionTrademark;
    }

    public void setDescriptionTrademark(String descriptionTrademark) {
        this.descriptionTrademark = descriptionTrademark;
    }

    @Override
    public String toString() {
        return "TradeMark [trademarkId=" + trademarkId + ", tradeMarkName=" + tradeMarkName + ", logo=" + logo
                + ", descriptionTrademark=" + descriptionTrademark + "]";
    }

}
