package ro.ase.cts.clase;

public class SoftBar {
    private String bautura;

    public SoftBar(String bautura) {
        this.bautura = bautura;
    }

    public void printeazaFacturaBar(){
        System.out.println("Se printeaza factura pentru bautura de la bar: "+this.bautura);
    }
}
