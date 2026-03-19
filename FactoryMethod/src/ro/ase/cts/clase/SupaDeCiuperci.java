package ro.ase.cts.clase;

public class SupaDeCiuperci extends Supa{
    public SupaDeCiuperci(int gramaj, double pret) {
        super(gramaj, pret);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Supa de ciuperci: " + super.toString());
    }
}
