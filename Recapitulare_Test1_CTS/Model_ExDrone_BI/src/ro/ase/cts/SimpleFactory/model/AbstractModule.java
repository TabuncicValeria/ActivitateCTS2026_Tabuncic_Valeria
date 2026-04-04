package ro.ase.cts.SimpleFactory.model;

public abstract class AbstractModule {
    protected String name;
    protected String description;
    protected float price;

    public AbstractModule(String name, String description, float price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AbstractModule{");
        sb.append("name='").append(name).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}
