package ro.ase.cts.clase;

public class AltSpital extends PacientHandler {
    @Override
    public String directioneazaPacient(Pacient pacient) {
        return "Pacientul "+pacient.getNumePacient()+" este redirectionat la un alt spital deoarece nu poate fi preluat!";
    }
}
