package java.model.entity;

public class Transport {
    private int transportId;
    private String transportName;
    private double priceTransPort;
    private String description_transport;

    public Transport(int transportId, String transportName, double priceTransPort, String description_transport) {
        this.transportId = transportId;
        this.transportName = transportName;
        this.priceTransPort = priceTransPort;
        this.description_transport = description_transport;
    }

    public Transport() {

    }

    public int getTransportId() {
        return transportId;
    }

    public void setTransportId(int transportId) {
        this.transportId = transportId;
    }

    public String getTransportName() {
        return transportName;
    }

    public void setTransportName(String transportName) {
        this.transportName = transportName;
    }

    public double getPriceTransPort() {
        return priceTransPort;
    }

    public void setPriceTransPort(double priceTransPort) {
        this.priceTransPort = priceTransPort;
    }

    public String getDescription_transport() {
        return description_transport;
    }

    public void setDescription_transport(String description_transport) {
        this.description_transport = description_transport;
    }

    @Override
    public String toString() {
        return "Transport [transportId=" + transportId + ", transportName=" + transportName + ", priceTransPort="
                + priceTransPort + ", description_transport=" + description_transport + "]";
    }

}
