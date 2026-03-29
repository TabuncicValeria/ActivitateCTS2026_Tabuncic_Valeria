package ro.ase.cts.clase;

public abstract class MijlocTransport {
    protected String denumireTransport;
    protected String marca;
    protected String nrInmatriculare;

    public MijlocTransport(String denumireTransport, String marca, String nrInmatriculare) {
        this.denumireTransport = denumireTransport;
        this.marca = marca;
        this.nrInmatriculare = nrInmatriculare;
    }

    public abstract void afisareDescriere();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MijlocTransport{");
        sb.append("denumireTransport='").append(denumireTransport).append('\'');
        sb.append(", marca='").append(marca).append('\'');
        sb.append(", nrInmatriculare='").append(nrInmatriculare).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
