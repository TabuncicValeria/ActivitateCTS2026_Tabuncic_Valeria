package ro.ase.cts.model.clase;

public class JavaCourse extends AbstractCourse{

    public JavaCourse(String titlu, int durataOre, double costBaza) {
        super(titlu, durataOre, costBaza);
    }

    @Override
    public void desfasoaraCurs() {
        System.out.println("Cursurile de Java se desfasoara joi si sunt sustinute de domnul Mihai");
    }

    @Override
    public double getCostFinal() {
        return costBaza + durataOre * 15;
    }
}
