package ro.ase.cts.SimpleFactory.model;

public class BaterieSuplimentara extends AbstractModule{
    private int timpIncarcare;
    private int nrIncarcari;

    public BaterieSuplimentara(String name, String description, float price, int timpIncarcare, int nrIncarcari) {
        super(name, description, price);
        this.timpIncarcare=timpIncarcare;
        this.nrIncarcari=nrIncarcari;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BaterieSuplimentara{");
        sb.append("name='").append(name).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", price=").append(price);
        sb.append(", timpIncarcare=").append(timpIncarcare);
        sb.append(", nrIncarcari=").append(nrIncarcari);
        sb.append('}');
        return sb.toString();
    }
}
