package ro.ase.cts.clase;

public abstract class PersonalNonMedical implements PersonalSpital{
    private String nume;
    private String telefon;
    private int aniExperienta;
    private double salariu;

    public PersonalNonMedical(String nume, String telefon, int aniExperienta, double salariu) {
        this.nume = nume;
        this.telefon = telefon;
        this.aniExperienta = aniExperienta;
        this.salariu = salariu;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PersonalNonMedical{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", telefon='").append(telefon).append('\'');
        sb.append(", aniExperienta=").append(aniExperienta);
        sb.append(", salariu=").append(salariu);
        sb.append('}');
        return sb.toString();
    }
}
