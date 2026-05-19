package ro.ase.cts.clase;

public class Medic {
    private String numeMedic;

    public Medic(String numeMedic) {
        this.numeMedic = numeMedic;
    }

    public String getNumeMedic() {
        return numeMedic;
    }

    public boolean decideInternareaPacientului(Pacient pacient){
        return pacient.getGravitate()>5;
    }
}
