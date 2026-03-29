package ro.ase.cts.clase;

public class Medic extends PersonalMedical{
    public Medic(String nume, String telefon, int aniExperienta, double salariu) {
        super(nume, telefon, aniExperienta, salariu);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Medic "+super.toString());
    }
}
