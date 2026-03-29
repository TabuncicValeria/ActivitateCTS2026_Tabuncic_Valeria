package ro.ase.cts.clase;

public class Registrator extends PersonalNonMedical{
    public Registrator(String nume, String telefon, int aniExperienta, double salariu) {
        super(nume, telefon, aniExperienta, salariu);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Registrator "+super.toString());
    }
}
