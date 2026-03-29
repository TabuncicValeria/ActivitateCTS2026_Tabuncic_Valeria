package ro.ase.cts.clase;

public class Brancardier extends PersonalMedical{
    public Brancardier(String nume, String telefon, int aniExperienta, double salariu) {
        super(nume, telefon, aniExperienta, salariu);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Brancardier "+super.toString());
    }
}
