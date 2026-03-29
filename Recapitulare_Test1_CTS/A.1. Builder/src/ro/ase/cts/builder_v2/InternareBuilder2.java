package ro.ase.cts.builder_v2;

public class InternareBuilder2 implements iBuilder2 {

    private Internare2 internare2;

    public InternareBuilder2(String numePacient) {
        this.internare2 = new Internare2(numePacient, false, false, false, false);
    }

    @Override
    public Internare2 build() {
        return this.internare2;
    }

    public InternareBuilder2 setPatRabatabil(boolean patRabatabil)
    {
        this.internare2.setPatRabatabil(patRabatabil);
        return this;
    }

    public InternareBuilder2 setMicDejun(boolean micDejun)
    {
        this.internare2.setMicDejun(micDejun);
        return this;
    }
    public InternareBuilder2 setPapuciCamera(boolean papuciCamera)
    {
        this.internare2.setPapuciDeCamera(papuciCamera);
        return this;
    }
    public InternareBuilder2 setHalatCamera(boolean halatCamera)
    {
        this.internare2.setHalatPentruInterior(halatCamera);
        return this;
    }
}
