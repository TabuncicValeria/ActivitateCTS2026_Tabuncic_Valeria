package ro.ase.cts.model.clase;

public class ManagementCourse extends AbstractCourse{
    public ManagementCourse(String titlu, int durataOre, double costBaza) {
        super(titlu, durataOre, costBaza);
    }

    @Override
    public void desfasoaraCurs() {
        System.out.println("Cursurile se desfasoara zilnic in sala de conferinte!");
    }

    @Override
    public double getCostFinal() {
        return costBaza + durataOre * 10;
    }
}
