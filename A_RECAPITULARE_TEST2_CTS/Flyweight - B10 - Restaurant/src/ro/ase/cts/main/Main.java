package ro.ase.cts.main;

import ro.ase.cts.clase.FabricaClienti;
import ro.ase.cts.clase.IClientRestaurant;
import ro.ase.cts.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        /*B.10.	Pentru fiecare rezervare trebuie să se rețină informații cu privire la clientul restaurantului precum:
         nume, număr de telefon, adresă de mail, etc, precum și informațiile despre masa rezervata: număr masa, număr
         persoane, ora rezervare, etc. Astfel, dacă un client realizează mai multe rezervări, la fiecare rezervare,
          informațiile despre client sunt aceleași și se repetă, ocupând foarte multă memorie. Să se implementeze
          modulul de memorare al rezervărilor astfel încât să nu ocupe memorie foarte multă.  */

        System.out.println("Flyweight - B10 - Restaurant");
        FabricaClienti fabricaClienti=new FabricaClienti();
        Rezervare rezervare1=new Rezervare(5,2,"16:00");
        Rezervare rezervare2=new Rezervare(7,4,"20:00");
        Rezervare rezervare3=new Rezervare(3,3,"21:30");

        IClientRestaurant client1= fabricaClienti.getClient("0726543128","Popa Dorin","popa@gmail.com");
        IClientRestaurant client2= fabricaClienti.getClient("0798443128","Sandu Arina","arinaSandu@gmail.com");
        IClientRestaurant client3= fabricaClienti.getClient("0654312876","Tabuncic Valeria","tabuncicvaleria@gmail.com");
        client1.afiseazaRezervare(rezervare1);
        client2.afiseazaRezervare(rezervare2);
        client3.afiseazaRezervare(rezervare3);
        System.out.println("Numar clienti unici salvati in memorie: "+fabricaClienti.getNumarClienti());


    }
}