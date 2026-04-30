package ro.ase.cts.clase;

public class Autobuz implements MijlocDeTransport{
    private String linia;
    private int nrCalatori;

    public Autobuz(String linia, int nrCalatori) {
        this.linia = linia;
        this.nrCalatori = nrCalatori;
    }

    @Override
    public void opresteInStatie() {
        System.out.println("Autobuzul "+this.linia+" opreste in statie!");
    }

    @Override
    public int getNrCalatori() {
        return this.nrCalatori;
    }

    @Override
    public String getLinie() {
        return linia;
    }
}
