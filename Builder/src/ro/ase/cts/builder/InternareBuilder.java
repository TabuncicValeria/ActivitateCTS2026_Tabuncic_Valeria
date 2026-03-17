package ro.ase.cts.builder;

public class InternareBuilder implements InternareBuilderAbstract{
    private Internare internare;

    public InternareBuilder(String nume){

        this.internare=new Internare(false,false,false,false,nume);
    }

    public InternareBuilder setArePatRabatabil(boolean arePatRabatabil){
        internare.patRabatabil=arePatRabatabil;
        return this;
    }

    public InternareBuilder setAreMicDejun(boolean areMicDejun){
        internare.micDejun=areMicDejun;
        return this;
    }

    public InternareBuilder setArePapuciCamera(boolean arePapuciCamera){
        internare.papuci=arePapuciCamera;
        return this;
    }

    public InternareBuilder setAreHalat(boolean areHalat){
        internare.halat=areHalat;
        return this;
    }

    public InternareBuilder setNume(String nume){
        internare.numePacient=nume;
        return this;
    }


    @Override
    public Internare build() {
        return internare;
    }
}
