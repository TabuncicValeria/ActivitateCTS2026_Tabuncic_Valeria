package ro.ase.cts.clase;

public class ClientRestaurant {
    private String nume;
    private String numarTelefon;
    private String adresaMail;

    public ClientRestaurant(String nume, String numarTelefon, String adresaMail) {
        this.nume = nume;
        this.numarTelefon = numarTelefon;
        this.adresaMail = adresaMail;
    }

    public String getNume() {
        return nume;
    }

    public String getNumarTelefon() {
        return numarTelefon;
    }

    public String getAdresaMail() {
        return adresaMail;
    }

    public boolean areNumarTelefon() {
        return numarTelefon != null && !numarTelefon.isEmpty();
    }

    public boolean areAdresaMail() {
        return adresaMail != null && !adresaMail.isEmpty();
    }
}
