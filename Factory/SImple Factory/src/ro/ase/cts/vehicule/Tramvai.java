package ro.ase.cts.vehicule;

public class Tramvai extends MijlocTransport{
    public Tramvai(String marca, int linia) {
        super(marca, linia);
    }


    public void afisareDescriere() {
        System.out.println("Tramvai\n "+super.toString());
    }
}
