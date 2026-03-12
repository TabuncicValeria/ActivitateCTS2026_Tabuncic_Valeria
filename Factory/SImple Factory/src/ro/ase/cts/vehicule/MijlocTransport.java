package ro.ase.cts.vehicule;

public abstract class MijlocTransport {
    private String marca;
    private int linia;

    public MijlocTransport(String marca, int linia)
    {
        this.marca=marca;
        this.linia=linia;
    }

    public abstract void afisareDescriere();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("MijlocTransport{");
        sb.append("linia=").append(linia);
        sb.append(", marca='").append(marca).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
