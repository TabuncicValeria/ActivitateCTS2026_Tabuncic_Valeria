package ro.ase.cts.clase;

public class Autobuz extends NodFlota{
    private String producator;
    private String model;
    private int nrLocuri;

    public Autobuz(String producator, String model, int nrLocuri) {
        super("Autobuz");
        this.producator=producator;
        this.model=model;
        this.nrLocuri=nrLocuri;
    }

    @Override
    public void afiseaza(String indentare) {
        System.out.println(indentare+"-Autobuz:"+producator+" "+model+" "+" , "+nrLocuri+" locuri disponibile");
    }
}
