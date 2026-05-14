package ro.ase.cts.main;

import ro.ase.cts.clase.ClientRestaurant;
import ro.ase.cts.clase.PlataCard;
import ro.ase.cts.clase.PlataCash;

public class Main {
    public static void main(String[] args) {
        /*B.11.	Este dorită implementarea modului de plată pentru clienții restaurantului. Modul de plată îl decide clientul
        în momentul în care trebuie să facă plata. Plata se poate realiza cu cardul sau cash. Sa se implementeze modulul
        de plata al restaurantului.  */

        System.out.println("Strategy - B11 - Restaurant");
        ClientRestaurant client1=new ClientRestaurant("Popa Alin");
        client1.platesteNota(120);
        client1.setModPlata(new PlataCard());
        client1.platesteNota(250);

        ClientRestaurant client2=new ClientRestaurant("Tonciu Mario",new PlataCard());
        client2.platesteNota(300);
        client2.setModPlata(new PlataCash());
        client2.platesteNota(80);
    }
}