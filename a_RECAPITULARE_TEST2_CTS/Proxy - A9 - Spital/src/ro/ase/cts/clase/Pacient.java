package ro.ase.cts.clase;

public class Pacient {
    private String numePacient;
    private String diagnoza;
    private boolean areAsigurare;

    public Pacient(String numePacient, String diagnoza, boolean areAsigurare) {
        this.numePacient = numePacient;
        this.diagnoza = diagnoza;
        this.areAsigurare = areAsigurare;
    }

    public boolean isAreAsigurare() {
        return areAsigurare;
    }

    public String getDiagnoza() {
        return diagnoza;
    }

    public String getNumePacient() {
        return numePacient;
    }
}
