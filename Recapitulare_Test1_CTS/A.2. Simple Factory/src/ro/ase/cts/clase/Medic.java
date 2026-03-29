package ro.ase.cts.clase;

public class Medic extends PersonalSpital{

    public Medic(String nume, int aniExperienta, double salariu) {
        super(nume, aniExperienta, salariu);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Medic: "+super.toString());
    }
}
