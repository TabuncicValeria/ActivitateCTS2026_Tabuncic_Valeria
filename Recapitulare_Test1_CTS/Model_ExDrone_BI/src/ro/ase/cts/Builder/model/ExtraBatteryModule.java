package ro.ase.cts.Builder.model;

public class ExtraBatteryModule extends AbstractModule {
    private int extraCapacity;
    private int chargingTime;

    public ExtraBatteryModule(String name, String description, float price, int extraCapacity, int chargingTime) {
        super(name, description, price);
        this.extraCapacity = extraCapacity;
        this.chargingTime = chargingTime;
    }

    @Override
    public String toString() {
        return "ExtraBatteryModule{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", extraCapacity=" + extraCapacity +
                ", chargingTime=" + chargingTime +
                '}';
    }
}
