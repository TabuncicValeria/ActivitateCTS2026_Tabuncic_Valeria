package ro.ase.cts.builder;

public class Internare {
    protected boolean patRabatabil;
    protected boolean micDejun;
    protected boolean papuci;
    protected boolean halat;
    protected String numePacient;

    public Internare(boolean patRabatabil, boolean micDejun,  boolean papuci,boolean halat, String numePacient) {
        this.patRabatabil = patRabatabil;
        this.micDejun = micDejun;
        this.papuci = papuci;
        this.halat = halat;
        this.numePacient = numePacient;
    }

    public void setHalat(boolean halat) {
        this.halat = halat;
    }

    public void setMicDejun(boolean micDejun) {
        this.micDejun = micDejun;
    }

    public void setNumePacient(String numePacient) {
        this.numePacient = numePacient;
    }

    public void setPapuci(boolean papuci) {
        this.papuci = papuci;
    }

    public void setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Internare{");
        sb.append("numePacient='").append(numePacient).append('\'');
        sb.append(", patRabatabil=").append(patRabatabil);
        sb.append(", micDejun=").append(micDejun);
        sb.append(", halat=").append(halat);
        sb.append(", papuci=").append(papuci);
        sb.append('}');
        return sb.toString();
    }
}

