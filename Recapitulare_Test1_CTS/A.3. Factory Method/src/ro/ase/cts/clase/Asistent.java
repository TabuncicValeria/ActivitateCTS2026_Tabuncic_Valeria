package ro.ase.cts.clase;

public class Asistent extends PersonalMedical{
    public Asistent(String nume, String telefon, int aniExperienta, double salariu) {
        super(nume, telefon, aniExperienta, salariu);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Asistent "+super.toString());
    }
}
