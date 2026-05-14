package ro.ase.cts.clase;

public abstract class NotificatorHandler {
    protected NotificatorHandler notificatorHandler;

    public NotificatorHandler() {
        this.notificatorHandler = null;
    }

    public void setNotificatorHandler(NotificatorHandler notificatorHandler) {
        this.notificatorHandler = notificatorHandler;
    }

    public abstract void notifica(ClientRestaurant client, String mesaj);
}
