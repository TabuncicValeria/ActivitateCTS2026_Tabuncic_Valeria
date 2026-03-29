package ro.ase.cts.clase;

public class CheeseCake extends Desert{
    public CheeseCake(int gramaj, double pret, int calorii) {
        super(gramaj, pret, calorii);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Detalii cheesecake: "+super.toString());
    }
}
