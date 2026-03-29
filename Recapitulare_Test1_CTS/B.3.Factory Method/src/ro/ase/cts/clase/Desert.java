package ro.ase.cts.clase;

public abstract class Desert implements FelMancare{
    private int gramaj;
    private double pret;
    private int calorii;

    public Desert(int gramaj, double pret, int calorii) {
        this.gramaj = gramaj;
        this.pret = pret;
        this.calorii = calorii;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("gramaj=").append(gramaj);
        sb.append(", pret=").append(pret);
        sb.append(", calorii=").append(calorii);
        return sb.toString();
    }
}
