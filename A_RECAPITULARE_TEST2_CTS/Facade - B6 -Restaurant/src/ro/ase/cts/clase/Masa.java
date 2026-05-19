package ro.ase.cts.clase;

public class Masa {
    private int numarMasa;
    private int capacitate;
    private boolean libera;
    private boolean debarasata;
    private boolean areServeteleNoi;

    public Masa(int numarMasa, int capacitate, boolean libera, boolean debarasata, boolean areServeteleNoi) {
        this.numarMasa = numarMasa;
        this.capacitate = capacitate;
        this.libera = libera;
        this.debarasata = debarasata;
        this.areServeteleNoi = areServeteleNoi;
    }

    public int getNumarMasa() {
        return numarMasa;
    }

    public boolean isLibera() {
        return libera;
    }

    public boolean isDebarasata() {
        return debarasata;
    }

    public int getCapacitate() {
        return capacitate;
    }

    public boolean isAreServeteleNoi() {
        return areServeteleNoi;
    }

    public void ocupaMasa()
    {
        this.libera=false;
    }

}
