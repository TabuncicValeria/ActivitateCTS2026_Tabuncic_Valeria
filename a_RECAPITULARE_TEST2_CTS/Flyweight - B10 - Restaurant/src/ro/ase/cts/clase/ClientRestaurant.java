package ro.ase.cts.clase;

public class ClientRestaurant implements IClientRestaurant{
    private String nume;
    private String numarTelefon;
    private String adresaMail;

    public ClientRestaurant(String nume, String numarTelefon, String adresaMail) {
        this.nume = nume;
        this.numarTelefon = numarTelefon;
        this.adresaMail = adresaMail;
    }

    @Override
    public void afiseazaRezervare(Rezervare rezervare) {
        System.out.println("Client "+this.toString());
        System.out.println("Rezervare: "+rezervare.toString());
        System.out.println("---------------------------------");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ClientRestaurant{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", numarTelefon='").append(numarTelefon).append('\'');
        sb.append(", adresaMail='").append(adresaMail).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
