package ro.ase.cts.clase;

public class ClientRestaurant {
    private String nume;
    private ModPlata modPlata;

    public ClientRestaurant(String nume) {
        this.nume = nume;
        this.modPlata=new PlataCash();
    }

    public ClientRestaurant(String nume, ModPlata modPlata) {
        this.nume = nume;
        this.modPlata = modPlata;
    }

    public ModPlata getModPlata() {
        return modPlata;
    }

    //pot schimba comportamentul prin setter
    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }

    public void platesteNota(float suma)
    {
        System.out.println(nume+": ");
        modPlata.plateste(suma);
    }
}
