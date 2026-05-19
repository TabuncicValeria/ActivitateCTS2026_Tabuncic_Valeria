package ro.ase.cts.clase;

public class AdapterSoftBar extends SoftBar implements ISoftRestaurant {
    public AdapterSoftBar(String bautura) {
        super(bautura);
    }

    @Override
    public void printeazaFactura() {
        super.printeazaFacutraBar();
    }
}
