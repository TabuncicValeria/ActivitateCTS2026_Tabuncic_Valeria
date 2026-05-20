package ro.ase.cts.clase;

public class TerapieIntensiva extends PacientHandler
{
    @Override
    public String directioneazaPacient(Pacient pacient)
    {
        if (pacient.getGravitate() >=7 && pacient.getGravitate()<10) {
            return "Pacientul " + pacient.getNumePacient() + " este directionat la sectia de terapie intesiva!";
        } else {
            return this.pacientHandler.directioneazaPacient(pacient);
        }
    }
}
