package ro.ase.cts.model;

public abstract class AbonamentAbstract implements ISubscription{
    protected String numePlan;
    protected int numarDispozitive;
    protected double pretBaza;

    public AbonamentAbstract(String numePlan, int numarDispozitive, double pretBaza) {
        this.numePlan = numePlan;
        this.numarDispozitive = numarDispozitive;
        this.pretBaza = pretBaza;
    }

    public String getDescriere()
    {
        return toString();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AbonamentAbstract{");
        sb.append("numePlan='").append(numePlan).append('\'');
        sb.append(", numarDispozitive=").append(numarDispozitive);
        sb.append(", pretBaza=").append(pretBaza);
        sb.append('}');
        return sb.toString();
    }
}
