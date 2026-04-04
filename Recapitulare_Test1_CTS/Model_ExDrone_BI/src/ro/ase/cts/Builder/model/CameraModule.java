package ro.ase.cts.Builder.model;

public class CameraModule extends AbstractModule {
    private String resolution;
    private boolean stabilization;

    public CameraModule(String name, String description, float price, String resolution, boolean stabilization) {
        super(name, description, price);
        this.resolution = resolution;
        this.stabilization = stabilization;
    }

    @Override
    public String toString() {
        return "CameraModule{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", resolution='" + resolution + '\'' +
                ", stabilization=" + stabilization +
                '}';
    }
}
