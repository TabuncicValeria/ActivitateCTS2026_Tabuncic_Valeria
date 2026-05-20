package ro.ase.cts.clase;

public class Masa {
    private int nrMasa;

    public Masa(int nrMasa) {
        this.nrMasa = nrMasa;
    }

    public void ocupaMasa()
    {
        System.out.println("Masa "+this.nrMasa+" a fost ocupata.");
    }
    public void rezervaMasa(){
        System.out.println("Masa "+this.nrMasa+" a fost rezervata.");
    }
}
