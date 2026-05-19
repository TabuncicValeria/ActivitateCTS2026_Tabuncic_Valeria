package ro.ase.cts.clase;

public class NotaDePlata implements INotaDePlata{
    private int numarMasa;
    private double total;

    public NotaDePlata(int numarMasa, double total) {
        this.numarMasa = numarMasa;
        this.total = total;
    }

    @Override
    public void printeazaNota() {
        System.out.println("Nota de plata pentru masa: "+this.numarMasa);
        System.out.println("Total inital: "+this.total+" lei");
    }

    @Override
    public double getTotal() {
        return this.total;
    }
}
