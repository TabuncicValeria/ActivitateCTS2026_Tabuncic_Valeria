package ro.ase.cts.SimpleFactory.model;

public class NightVision extends AbstractModule{

    private int infraredRange;
    private boolean thermalSupport;

    public NightVision(String name, String description, float price, int infraredRange,boolean thermalSupport) {
        super(name, description, price);
        this.infraredRange=infraredRange;
        this.thermalSupport=thermalSupport;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("NightVision{");
        sb.append("name='").append(name).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", infraredRange=").append(infraredRange);
        sb.append(", thermalSupport=").append(thermalSupport);
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}
