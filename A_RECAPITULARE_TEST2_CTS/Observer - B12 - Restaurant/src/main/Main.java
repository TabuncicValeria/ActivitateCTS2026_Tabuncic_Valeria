package main;

import clase.Client;
import clase.ClientFidel;
import clase.IRestaurant;
import clase.Restaurant;

public class Main {
    public static void main(String[] args) {
        /*B.12.	Restaurantul dorește să anunțe clienții fideli ori de câte ori apar noi oferte. Astfel se dorește
         implementarea unui modul care atunci când se realizează o ofertă de preț sau se introduce un nou meniu să
         se trimită notificări tuturor clienților abonați la notificările restaurantului.  */

        //Restaurantul - sub. observabil, Clientii - observatorii - pe ei ii notificam
        System.out.println("Observer - B12 - Restaurant");
        Client c1=new ClientFidel("Tabuncic Valeria","07123654789");
        Client c2=new ClientFidel("Dudnic Madalina","0654234125");
        Client c3=new ClientFidel("Olaru Anatol","0744552312");

        IRestaurant restaurant=new Restaurant("La Placinte");
        restaurant.aboneazaClient(c1);
        restaurant.aboneazaClient(c2);
        restaurant.aboneazaClient(c3);

        ((Restaurant) restaurant).notificaOfertaPret();
        System.out.println();
        restaurant.dezaboneazaClient(c2);
        ((Restaurant) restaurant).notificaMeniuNou();
    }
}