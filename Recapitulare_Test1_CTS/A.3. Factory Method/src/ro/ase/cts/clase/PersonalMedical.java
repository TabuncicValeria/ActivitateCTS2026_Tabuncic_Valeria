package ro.ase.cts.clase;

public abstract class PersonalMedical implements PersonalSpital
{
    private String nume;
    private String telefon;
    private int aniExperienta;
    private double salariu;

    public PersonalMedical(String nume, String telefon, int aniExperienta, double salariu) {
        this.nume = nume;
        this.telefon = telefon;
        this.aniExperienta = aniExperienta;
        this.salariu = salariu;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PersonalMedical{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", telefon='").append(telefon).append('\'');
        sb.append(", aniExperienta=").append(aniExperienta);
        sb.append(", salariu=").append(salariu);
        sb.append('}');
        return sb.toString();
    }
}
