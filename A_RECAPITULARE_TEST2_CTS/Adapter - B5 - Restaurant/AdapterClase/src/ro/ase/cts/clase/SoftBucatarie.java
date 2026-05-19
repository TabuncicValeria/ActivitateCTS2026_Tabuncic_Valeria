package ro.ase.cts.clase;

public class SoftBucatarie implements ISoftRestaurant{
    private String produs;

    public SoftBucatarie(String produs) {
        this.produs = produs;
    }

    @Override
    public void printeazaFactura() {
        System.out.println("Se printeza factura pentru urmatorul produs consumat: "+this.produs);
    }
}
