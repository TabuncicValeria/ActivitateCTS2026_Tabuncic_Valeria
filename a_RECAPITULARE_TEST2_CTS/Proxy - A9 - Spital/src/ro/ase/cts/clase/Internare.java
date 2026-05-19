package ro.ase.cts.clase;

public class Internare implements AbstractInternarePacient{

    @Override
    public void interneazaPacient(Pacient pacient) {
        System.out.println("Pacientul "+pacient.getNumePacient()+" este internat avand urmatorul diagnostic: "+pacient.getDiagnoza());
    }
}
