package ro.ase.cts.clase;

public class Tramvai extends MijlocTransport{

    public Tramvai(String denumireTransport, String marca, String nrInmatriculare) {
        super(denumireTransport, marca, nrInmatriculare);
    }

    @Override
    public void afisareDescriere() {
        System.out.println(super.toString());
    }
}
