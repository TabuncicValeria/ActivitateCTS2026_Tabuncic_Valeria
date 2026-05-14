package ro.ase.cts.main;

import ro.ase.cts.clase.ItemMeniu;
import ro.ase.cts.clase.OptiuneMeniu;
import ro.ase.cts.clase.SectiuneMeniu;

public class Main {
    public static void main(String[] args) {
        /*B.8.	Este dorita reprezentarea meniului in cadrul aplicației. Meniul conține secțiuni
        (startere, băuturi, desert, etc.) fiecare secțiune poate conține subsecțiuni (sucuri, cafea, etc)
         sau item-uri (, apa plata, apa minerala, etc). Sa se realizeze modulul care permite reprezentarea
         arborescenta a meniului restaurantului.  */

        //Nod container - SectiuneMeniu - poate contine alte elem
        //Nod frunza - ItemMeniu - nu poate contine alte elem
        System.out.println("Composite - B8 - Restaurant");
        OptiuneMeniu meniuRestaurant = new SectiuneMeniu("Meniu Restaurant");

        OptiuneMeniu startere = new SectiuneMeniu("Startere");
        OptiuneMeniu bauturi = new SectiuneMeniu("Bauturi");
        OptiuneMeniu desert = new SectiuneMeniu("Desert");

        OptiuneMeniu sucuri = new SectiuneMeniu("Sucuri");
        OptiuneMeniu cafea = new SectiuneMeniu("Cafea");

        OptiuneMeniu bruschete = new ItemMeniu("Bruschete", 25);
        OptiuneMeniu salataVinete = new ItemMeniu("Salata de vinete", 22);

        OptiuneMeniu apaPlata = new ItemMeniu("Apa plata", 8);
        OptiuneMeniu apaMinerala = new ItemMeniu("Apa minerala", 8);
        OptiuneMeniu cola = new ItemMeniu("Cola", 10);
        OptiuneMeniu fanta = new ItemMeniu("Fanta", 10);

        OptiuneMeniu espresso = new ItemMeniu("Espresso", 9);
        OptiuneMeniu cappuccino = new ItemMeniu("Cappuccino", 14);

        OptiuneMeniu papanasi = new ItemMeniu("Papanasi", 28);
        OptiuneMeniu cheesecake = new ItemMeniu("Cheesecake", 24);

        startere.adaugaOptiune(bruschete);
        startere.adaugaOptiune(salataVinete);

        sucuri.adaugaOptiune(apaPlata);
        sucuri.adaugaOptiune(apaMinerala);
        sucuri.adaugaOptiune(cola);
        sucuri.adaugaOptiune(fanta);

        cafea.adaugaOptiune(espresso);
        cafea.adaugaOptiune(cappuccino);

        bauturi.adaugaOptiune(sucuri);
        bauturi.adaugaOptiune(cafea);

        desert.adaugaOptiune(papanasi);
        desert.adaugaOptiune(cheesecake);

        meniuRestaurant.adaugaOptiune(startere);
        meniuRestaurant.adaugaOptiune(bauturi);
        meniuRestaurant.adaugaOptiune(desert);

        meniuRestaurant.afiseaza("");
    }
}