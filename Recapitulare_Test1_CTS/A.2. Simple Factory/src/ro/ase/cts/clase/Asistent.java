package ro.ase.cts.clase;

public class Asistent extends PersonalSpital{
    public Asistent(String nume, int aniExperienta, double salariu) {
        super(nume, aniExperienta, salariu);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Asistent: "+super.toString());
    }
}
