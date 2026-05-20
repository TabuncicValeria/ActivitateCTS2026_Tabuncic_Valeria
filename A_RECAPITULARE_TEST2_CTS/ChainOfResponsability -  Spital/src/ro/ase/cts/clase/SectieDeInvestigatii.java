package ro.ase.cts.clase;

public class SectieDeInvestigatii extends PacientHandler
{
    @Override
    public String directioneazaPacient(Pacient pacient)
    {
        if (pacient.getGravitate() >=3 && pacient.getGravitate()<7) {
            return "Pacientul " + pacient.getNumePacient() + " este directionat la sectia de investigatii!";
        } else {
            return this.pacientHandler.directioneazaPacient(pacient);
        }
    }
}
