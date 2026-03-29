package ro.ase.cts.clase;

public class SupaCiuperci extends Supa{
    public SupaCiuperci(int gramaj, double pret, int calorii) {
        super(gramaj, pret, calorii);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Supa de ciuperci: "+super.toString());
    }
}
