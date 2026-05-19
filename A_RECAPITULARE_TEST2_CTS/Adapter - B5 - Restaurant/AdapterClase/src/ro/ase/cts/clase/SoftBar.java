package ro.ase.cts.clase;

public class SoftBar {
    private String bautura;

    public SoftBar(String bautura) {
        this.bautura = bautura;
    }

    public void printeazaFacutraBar()
    {
        System.out.println("Se printeaza factura pentru bautura consumata: "+this.bautura);
    }
}

