package ro.ase.cts.SimpleFactory.model;

public class GpsTracking extends AbstractModule{

    private float accuracy;
    private boolean realTimeTracking;

    public GpsTracking(String name, String description, float price, float accuracy,boolean realTimeTracking) {
        super(name, description, price);
        this.accuracy=accuracy;
        this.realTimeTracking=realTimeTracking;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GpsTracking{");
        sb.append("name='").append(name).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", price=").append(price);
        sb.append(", accuracy=").append(accuracy);
        sb.append(", realTimeTracking=").append(realTimeTracking);
        sb.append('}');
        return sb.toString();
    }
}
