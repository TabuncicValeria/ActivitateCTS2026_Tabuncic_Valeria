package ro.ase.cts.clase;

public class ItemMeniu extends OptiuneMeniu{

    private double pret;
    public ItemMeniu(String denumire,double pret) {
        super(denumire);
        this.pret=pret;
    }

    @Override
    public void afiseaza(String indentare) {
        System.out.println(indentare+"Item: "+getDenumire()+" - "+pret+" lei.");
    }
}
