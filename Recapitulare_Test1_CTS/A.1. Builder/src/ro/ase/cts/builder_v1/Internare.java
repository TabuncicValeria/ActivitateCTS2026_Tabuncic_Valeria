package ro.ase.cts.builder_v1;

public class Internare {
    private String numePacient;
    private boolean patRabatabil;
    private boolean micDejun;
    private boolean papuciDeCamera;
    private boolean halatPentruInterior;

    public Internare(String numePacient, boolean patRabatabil, boolean micDejun, boolean papuciDeCamera, boolean halatPentruInterior) {
        this.numePacient = numePacient;
        this.patRabatabil = patRabatabil;
        this.micDejun = micDejun;
        this.papuciDeCamera = papuciDeCamera;
        this.halatPentruInterior = halatPentruInterior;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Internare{");
        sb.append("numePacient='").append(numePacient).append('\'');
        sb.append(", patRabatabil=").append(patRabatabil);
        sb.append(", micDejun=").append(micDejun);
        sb.append(", papuciDeCamera=").append(papuciDeCamera);
        sb.append(", halatPentruInterior=").append(halatPentruInterior);
        sb.append('}');
        return sb.toString();
    }
}
