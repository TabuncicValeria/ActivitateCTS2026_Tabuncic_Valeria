package ro.ase.cts.clase;

public class Clatite extends Desert{
    public Clatite(int gramaj, double pret, int calorii) {
        super(gramaj, pret, calorii);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Detalii clatite: "+super.toString());
    }
}
