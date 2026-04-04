package ro.ase.cts.Builder.model;

public abstract class AbstractModule {
    protected String name;
    protected String description;
    protected float price;

    public AbstractModule(String name, String description, float price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "AbstractModule{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }

}
