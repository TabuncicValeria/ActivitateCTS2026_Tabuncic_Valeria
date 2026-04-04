package ro.ase.cts.model.clase;

public class NegociationCourse extends AbstractCourse{
    public NegociationCourse(String titlu, int durataOre, double costBaza) {
        super(titlu, durataOre, costBaza);
    }

    @Override
    public void desfasoaraCurs() {
        System.out.println("Cursurile sunt obligatorii!");
    }

    @Override
    public double getCostFinal() {
        return costBaza + durataOre * 10;
    }
}
