package ro.ase.cts.SimpleFactory.model;

public class UrmarireInteligenta extends AbstractModule{
    private int distanta;
    private int timp;
    public UrmarireInteligenta(String name, String description, float price, int distanta,int timp) {
        super(name, description, price);
        this.distanta=distanta;
        this.timp=timp;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UrmarireInteligenta{");
        sb.append("name='").append(name).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", price=").append(price);
        sb.append(", distanta=").append(distanta);
        sb.append(", timp=").append(timp);
        sb.append('}');
        return sb.toString();
    }
}
