package ro.ase.cts.clase;

public class Troleibuz extends MijlocTransport{

    public Troleibuz(String denumireTransport, String marca, String nrInmatriculare) {
        super(denumireTransport, marca, nrInmatriculare);
    }

    @Override
    public void afisareDescriere() {
        System.out.println(super.toString());
    }
}
