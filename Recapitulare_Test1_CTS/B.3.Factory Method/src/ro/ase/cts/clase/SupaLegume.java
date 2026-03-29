package ro.ase.cts.clase;

public class SupaLegume extends Supa{

    public SupaLegume(int gramaj, double pret, int calorii) {
        super(gramaj, pret, calorii);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Supa de legume: "+super.toString());
    }
}
