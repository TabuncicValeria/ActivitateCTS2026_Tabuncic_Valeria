package ro.ase.cts.hotel;

public class MicDejun extends ServiciuHotel{
    private final int nrPersoane;
    private final int nrZile;

    public MicDejun(double pretBaza, int nrPersoane, int nrZile) {
        super("MicDejun", pretBaza);
        this.nrPersoane = nrPersoane;
        this.nrZile = nrZile;
    }

    @Override
    public double calculeazaCost() {
        return nrPersoane*nrZile*pretBaza;
    }

    @Override
    public String toString() {
        return "MicDejun{" +
                "nrPersoane=" + nrPersoane +
                ", nrZile=" + nrZile +
                ", cost=" + calculeazaCost() +
                '}';
    }
}
