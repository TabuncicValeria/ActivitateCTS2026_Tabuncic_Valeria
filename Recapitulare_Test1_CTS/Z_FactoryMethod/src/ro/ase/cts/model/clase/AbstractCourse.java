package ro.ase.cts.model.clase;

public abstract class AbstractCourse implements ICourse {
    protected String titlu;
    protected int durataOre;
    protected double costBaza;

    public AbstractCourse(String titlu, int durataOre, double costBaza) {
        this.titlu = titlu;
        this.durataOre = durataOre;
        this.costBaza = costBaza;
    }

    public void afisareDetalii(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AbstractCourse{");
        sb.append("titlu='").append(titlu).append('\'');
        sb.append(", durataOre=").append(durataOre);
        sb.append(", costFinal=").append(getCostFinal());
        sb.append('}');
        return sb.toString();
    }

    @Override
    public String getTitlu() {
        return titlu;
    }
}
