
package ro.ase.cts.vehicule;

public class Troleibuz extends MijlocTransport{
    public Troleibuz(String marca, int linia) {
        super(marca, linia);
    }


    public void afisareDescriere() {
        System.out.println("Troleibuz\n "+super.toString());
    }
}
