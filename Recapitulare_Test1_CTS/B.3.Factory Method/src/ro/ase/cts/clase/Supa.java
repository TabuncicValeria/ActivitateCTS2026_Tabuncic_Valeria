package ro.ase.cts.clase;

public abstract class Supa implements FelMancare{
    private int gramaj;
    private double pret;
    private int calorii;

    public Supa(int gramaj, double pret, int calorii) {
        this.gramaj = gramaj;
        this.pret = pret;
        this.calorii = calorii;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("calorii=").append(calorii);
        sb.append(", gramaj=").append(gramaj);
        sb.append(", pret=").append(pret);
        return sb.toString();
    }
}
