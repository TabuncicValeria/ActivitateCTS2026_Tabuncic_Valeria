package ro.ase.cts.SimpleFactory.model;

public class HighResolutionCamera extends AbstractModule{
    private int resolution;
    private int zoomLevel;

    public HighResolutionCamera(String name, String description, float price, int resolution, int zoomLevel) {
        super(name, description, price);
        this.resolution=resolution;
        this.zoomLevel=zoomLevel;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("HighResolutionCamera{");
        sb.append("name='").append(name).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", price=").append(price);
        sb.append(", resolution=").append(resolution);
        sb.append(", zoomLevel=").append(zoomLevel);
        sb.append('}');
        return sb.toString();
    }
}
