package ro.ase.cts.program;

import ro.ase.cts.clase.PrototypeRezervare;
import ro.ase.cts.clase.Rezervare;

public class Main {
    public static void main(String[] args) {

        PrototypeRezervare rezervare1 = new Rezervare("Olga", 3, "14", "07265432178");
        PrototypeRezervare rezervare2 = rezervare1.copiaza();
        ((Rezervare) rezervare2).setNumarPersoane(5);
        ((Rezervare) rezervare2).setOraRezervare("20");

        System.out.println(rezervare1.toString());
        System.out.println(rezervare2.toString());
    }
}