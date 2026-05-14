package ro.ase.cts.clase;

public class NotificatorEmail extends NotificatorHandler{
    @Override
    public void notifica(ClientRestaurant client, String mesaj) {
        if (client.areAdresaMail()) {
            System.out.println("Clientul " + client.getNume() +
                    " a primit email la adresa " + client.getAdresaMail() +
                    ": " + mesaj);
        } else {
            if (this.notificatorHandler != null) {
                this.notificatorHandler.notifica(client, mesaj);
            }
        }

    }
}
