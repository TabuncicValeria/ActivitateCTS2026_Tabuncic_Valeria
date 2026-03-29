package ro.ase.cts.clase;

public class SupaVita extends Supa{
    public SupaVita(int gramaj, double pret, int calorii) {
        super(gramaj, pret, calorii);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Supa de vita: "+super.toString());
    }
}
