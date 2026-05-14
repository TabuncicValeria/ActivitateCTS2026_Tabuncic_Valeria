package ro.ase.cts.clase;

public abstract class DecoratorNotaDePlata implements INotaDePlata{

    protected INotaDePlata notaDePlata;

    public DecoratorNotaDePlata(INotaDePlata notaDePlata) {
        this.notaDePlata = notaDePlata;
    }

    @Override
    public void printeazaNota() {
        notaDePlata.printeazaNota();
    }

    @Override
    public double getTotal() {
        return notaDePlata.getTotal();
    }
    public abstract void printeazaFelicitare();
}
