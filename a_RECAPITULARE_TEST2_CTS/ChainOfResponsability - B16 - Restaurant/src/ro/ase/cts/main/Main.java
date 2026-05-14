package ro.ase.cts.main;

import ro.ase.cts.clase.*;

public class Main {
    public static void main(String[] args) {

        /*B.16.	Restaurantul dorește să anunțe clienții fideli ori de câte ori apar noi oferte. Astfel se dorește implementarea unui modul sa notifice clienții
         restaurantului. Problema este că restaurantul deține pentru anumiți clienți numărul de telefon, iar pentru alți clienți doar adresa de mail. Să se
          implementeze funcționalitatea de a trimite notificări clienților prin SMS, iar în cazul în care pentru anumiți clienți restaurantul nu are în baza de
           date numărul de telefon, să se trimită notificarea prin email. În cazul clienților pentru care nu există nici numărul de telefon, nici adresa de mail,
           se trimite managerului restaurantului o notificare cu numele clientului pentru care nu există date de contact.  */
        System.out.println("Chain of Responsability - B16 - Restaurant");
        ClientRestaurant client1 = new ClientRestaurant("Andrei Popa", "0712345678", "andrei.popa@gmail.com");
        ClientRestaurant client2 = new ClientRestaurant("Elena Marin", null, "elena.marin@yahoo.com");
        ClientRestaurant client3 = new ClientRestaurant("Radu Ionescu", "", "");
        ClientRestaurant client4 = new ClientRestaurant("Ioana Dumitrescu", "0744555666", null);
        ClientRestaurant client5 = new ClientRestaurant("Mihai Stan", null, "");

        NotificatorHandler notificatorSMS = new NotificatorSMS();
        NotificatorHandler notificatorEmail = new NotificatorEmail();
        NotificatorHandler notificatorManager = new NotificatorManager("Cristian Georgescu");

        notificatorSMS.setNotificatorHandler(notificatorEmail);
        notificatorEmail.setNotificatorHandler(notificatorManager);

        String mesaj = "A aparut o noua oferta la restaurant!";

        notificatorSMS.notifica(client1, mesaj);
        notificatorSMS.notifica(client2, mesaj);
        notificatorSMS.notifica(client3, mesaj);
        notificatorSMS.notifica(client4, mesaj);
        notificatorSMS.notifica(client5, mesaj);
    }
}