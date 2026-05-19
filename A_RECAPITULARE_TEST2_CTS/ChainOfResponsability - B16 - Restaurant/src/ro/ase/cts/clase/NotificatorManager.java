package ro.ase.cts.clase;

public class NotificatorManager extends NotificatorHandler{

    private String numeManager;

    public NotificatorManager(String numeManager) {
        this.numeManager = numeManager;
    }

    @Override
    public void notifica(ClientRestaurant client, String mesaj) {
        System.out.println("Managerul " + this.numeManager +
                " a fost notificat: Clientul " + client.getNume() +
                " nu are date de contact.");
    }
}
