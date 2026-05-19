package ro.ase.cts.clase;

public class InternareCuAsigurare implements AbstractInternarePacient{
    private AbstractInternarePacient internareAbstracta;

    public InternareCuAsigurare(AbstractInternarePacient internareAbstracta) {
        this.internareAbstracta = internareAbstracta;
    }

    @Override
    public void interneazaPacient(Pacient pacient) {
       if(pacient.isAreAsigurare())
       {
           internareAbstracta.interneazaPacient(pacient);
       }
       else {
           System.out.println("Pacientul" +pacient.getNumePacient()+" nu poate fi internat deoarece nu are asigurare medicala");
       }
    }
}
