package ro.ase.cts.clase;

public class Autobuz extends MijlocTransport {
    public Autobuz(String denumireTransport, String marca, String nrInmatriculare) {
        super(denumireTransport, marca, nrInmatriculare);
    }

    @Override
    public void afisareDescriere() {
        System.out.println(super.toString());
    }
}
