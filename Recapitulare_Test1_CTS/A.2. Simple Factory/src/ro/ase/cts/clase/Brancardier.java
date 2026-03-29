package ro.ase.cts.clase;

public class Brancardier extends PersonalSpital{


    public Brancardier(String nume, int aniExperienta, double salariu) {
        super(nume, aniExperienta, salariu);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Brancardier: "+super.toString());
    }
}
