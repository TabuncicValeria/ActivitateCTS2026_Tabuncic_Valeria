package ro.ase.cts.main;

import ro.ase.cts.clase.*;

public class Main {
    public static void main(String[] args) {
        /*B.6.	În momentul în care un client vine la restaurant pentru o masă, recepționistul trebuie să verifice
         dacă are masă liberă, apoi să verifice dacă acea masă a fost debarasată de la plecarea ultimului client,
          de asemenea trebuie să verifice dacă au fost puse șervețele noi pe masă. Managerul restaurantului dorește
          realizarea unui modul care să simplifice munca recepționistului și să nu mai fie nevoit să verifice în
           toate locurile ci doar într-un singur loc.  */

        System.out.println("Facade - B6");
        SalaRestaurant salaRestaurant=new SalaRestaurant();
        MasaDebarasata masaDebarasata=new MasaDebarasata();
        ServeteleMasa serveteleMasa=new ServeteleMasa();

        FacadeMasa masa=new FacadeMasa(salaRestaurant,masaDebarasata,serveteleMasa);
        masa.asezareClientiLaMasa(2);
        masa.asezareClientiLaMasa(4);
        masa.asezareClientiLaMasa(5);
        masa.asezareClientiLaMasa(6);
        masa.asezareClientiLaMasa(10);
    }
}