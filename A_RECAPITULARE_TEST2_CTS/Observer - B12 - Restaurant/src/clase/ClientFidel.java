package clase;

public class ClientFidel implements Client{
    private String nume;
    private String numarTelefon;

    public ClientFidel(String nume, String numarTelefon) {
        this.nume = nume;
        this.numarTelefon = numarTelefon;
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println("Clientul "+this.nume+" a primit notificarea "+mesaj);
    }
}
