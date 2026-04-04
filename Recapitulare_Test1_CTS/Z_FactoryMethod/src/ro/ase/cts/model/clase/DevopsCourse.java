package ro.ase.cts.model.clase;

public class DevopsCourse extends AbstractCourse{
    public DevopsCourse(String titlu, int durataOre, double costBaza) {
        super(titlu, durataOre, costBaza);
    }

    @Override
    public void desfasoaraCurs() {
        System.out.println("Cursul se desfasoara sapatamanal, luni, de la ora 18:00 in sala 1987.");
    }

    @Override
    public double getCostFinal() {
        return costBaza + durataOre * 15;
    }
}
