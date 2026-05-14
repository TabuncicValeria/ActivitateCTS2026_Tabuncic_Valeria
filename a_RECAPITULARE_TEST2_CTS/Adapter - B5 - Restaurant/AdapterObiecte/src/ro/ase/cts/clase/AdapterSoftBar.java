package ro.ase.cts.clase;

public class AdapterSoftBar implements ISoftRestaurant{

    //primesc un obiect de tipul clasei pe care trebuie sa o adaptez
    private SoftBar softBar;

    public AdapterSoftBar(SoftBar softBar) {
        this.softBar = softBar;
    }

    @Override
    public void printeazaFactura() {
        softBar.printeazaFacturaBar();//apelez meth din clasa SoftBar
    }
}
