package ro.ase.cts.program;

import ro.ase.cts.prototype.ContClient;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("B.4. - Prototype");
        List<String> cerinte=new ArrayList<>();
        cerinte.add("masa la geam");
        cerinte.add("muzica clasica");
        cerinte.add("alergie la produse lactate");

        ContClient client1=new ContClient("Tabuncic Valeria","+40723475123","tabv@gmail.com",2,cerinte);
        ContClient clientCopie=client1.copiaza();

        client1.afisareDescriere();
        clientCopie.afisareDescriere();

    }
}