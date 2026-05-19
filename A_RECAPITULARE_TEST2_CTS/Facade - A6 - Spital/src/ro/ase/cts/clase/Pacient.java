package ro.ase.cts.clase;

public class Pacient {
    private String numePacient;
    private int gravitate;

    public Pacient(String numePacient, int gravitate) {
        this.numePacient = numePacient;
        this.gravitate = gravitate;
    }

    public int getGravitate() {
        return gravitate;
    }

    public String getNumePacient() {
        return numePacient;
    }
}
