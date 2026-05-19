package ro.ase.cts.clase;

public class DecoratorNotaFelicitareSiDiscount extends DecoratorNotaDePlata{
    private double procentDiscount;

    public DecoratorNotaFelicitareSiDiscount(INotaDePlata notaDePlata, double procentDiscount) {
        super(notaDePlata);
        this.procentDiscount=procentDiscount;
    }

    @Override
    public void printeazaNota() {
        super.printeazaNota();
        double valoareDiscount=super.getTotal()*procentDiscount/100;
        double totalFinal=super.getTotal()-valoareDiscount;

        System.out.println("Dicount aplicat: "+procentDiscount+"%");
        System.out.println("Valoare discount: "+valoareDiscount+" lei");
        System.out.println("Total dupa discount: "+totalFinal+" lei");
        printeazaFelicitare();
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("La multi ani si sarbatori fericite!");
    }
}
