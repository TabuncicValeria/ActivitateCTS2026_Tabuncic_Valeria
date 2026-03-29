package ro.ase.cts.builder_v1;

public class InternareBuilder implements iBuilder {
    private String numePacient;
    private boolean patRabatabil;
    private boolean micDejun;
    private boolean papuciDeCamera;
    private boolean halatPentruInterior;

    public InternareBuilder(String numePacient)
    {
        this.numePacient=numePacient;
        this.patRabatabil=false;
        this.micDejun=false;
        this.papuciDeCamera=false;
        this.halatPentruInterior=false;
    }

    public InternareBuilder setPatRabatabil(boolean patRabatabil)
    {
        this.patRabatabil=patRabatabil;
        return this;
    }

    public InternareBuilder setMicDejun(boolean micDejun) {
        this.micDejun = micDejun;
        return this;
    }

    public InternareBuilder setPapuciDeCamera(boolean papuciDeCamera) {
        this.papuciDeCamera = papuciDeCamera;
        return this;
    }

    public InternareBuilder setHalatPentruInterior(boolean halatPentruInterior) {
        this.halatPentruInterior = halatPentruInterior;
        return this;
    }


    @Override
    public Internare build() {
        return new Internare(numePacient,patRabatabil,micDejun,papuciDeCamera,halatPentruInterior);
    }
}
