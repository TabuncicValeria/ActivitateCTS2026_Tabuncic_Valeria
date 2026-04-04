package ro.ase.cts.model.clase;

public class LeadershipCourse extends AbstractCourse{
    public LeadershipCourse(String titlu, int durataOre, double costBaza) {
        super(titlu, durataOre, costBaza);
    }

    @Override
    public void desfasoaraCurs() {
        System.out.println("Cursurile se desfasoara in fiecare zi de luni si vineri la ora 12:00.");
    }

    @Override
    public double getCostFinal() {
        return costBaza + durataOre * 10;
    }
}
