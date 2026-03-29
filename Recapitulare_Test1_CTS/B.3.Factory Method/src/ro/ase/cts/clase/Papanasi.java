package ro.ase.cts.clase;

public class Papanasi extends Desert{
    public Papanasi(int gramaj, double pret, int calorii) {
        super(gramaj, pret, calorii);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Detalii papanasi: "+super.toString());
    }
}
