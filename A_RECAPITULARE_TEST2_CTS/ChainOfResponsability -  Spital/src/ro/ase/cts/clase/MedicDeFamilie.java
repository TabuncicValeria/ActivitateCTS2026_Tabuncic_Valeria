package ro.ase.cts.clase;

public class MedicDeFamilie extends PacientHandler
{
    @Override
    public String directioneazaPacient(Pacient pacient)
    {
        if (pacient.getGravitate() < 3) {
            return "Pacientul " + pacient.getNumePacient() + " este directionat la medicul de familie!";
        } else {
            return this.pacientHandler.directioneazaPacient(pacient);
        }
    }

}
