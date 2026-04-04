package ro.ase.cts.model.clase;

public class PythonCourse extends AbstractCourse{
    public PythonCourse(String titlu, int durataOre, double costBaza) {
        super(titlu, durataOre, costBaza);
    }

    @Override
    public void desfasoaraCurs() {
        System.out.println("Cursurile se desfasoara miercuri in sala 2001.");
    }

    @Override
    public double getCostFinal() {
        return costBaza + durataOre * 15;
    }
}
