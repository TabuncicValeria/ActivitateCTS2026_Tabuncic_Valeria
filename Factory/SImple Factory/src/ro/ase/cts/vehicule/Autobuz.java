package ro.ase.cts.vehicule;

public class Autobuz extends MijlocTransport{

    public Autobuz(String marca, int linia) {
        super(marca, linia);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Autobuzul\n "+super.toString());
    }
}
