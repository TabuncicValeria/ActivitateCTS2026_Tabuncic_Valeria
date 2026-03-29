package ro.ase.cts.clase;

public class Secretar extends PersonalNonMedical{
    public Secretar(String nume, String telefon, int aniExperienta, double salariu) {
        super(nume, telefon, aniExperienta, salariu);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Secretar "+super.toString());
    }
}
