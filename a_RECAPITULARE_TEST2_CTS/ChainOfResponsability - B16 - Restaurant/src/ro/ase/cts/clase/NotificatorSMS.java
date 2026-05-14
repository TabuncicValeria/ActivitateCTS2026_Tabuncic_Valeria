package ro.ase.cts.clase;

public class NotificatorSMS extends NotificatorHandler{
    @Override
    public void notifica(ClientRestaurant client, String mesaj) {
        if (client.areNumarTelefon()) {
            System.out.println("Clientul " + client.getNume() +
                    " a primit SMS la numarul " + client.getNumarTelefon() +
                    ": " + mesaj);
        } else {
            if (this.notificatorHandler != null) {
                this.notificatorHandler.notifica(client, mesaj);
            }
        }

    }
}
