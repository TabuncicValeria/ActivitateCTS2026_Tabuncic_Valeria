package ro.ase.cts.main;

import ro.ase.cts.clase.Autobuz;
import ro.ase.cts.clase.Calator;
import ro.ase.cts.clase.IAutobuz;
import ro.ase.cts.clase.ICalator;

public class Main {
    public static void main(String[] args) {

        System.out.println("Observer - F11 - STB");
        ICalator calator1= new Calator("Tabuncic Valeria", "+40754231456");
        ICalator calator2= new Calator("Muntean Alina","+40723124234");
        IAutobuz autobuz=new Autobuz("123");
        autobuz.aboneazaCalator(calator1);
        autobuz.aboneazaCalator(calator2);
        ((Autobuz)autobuz).notificaPornireAutbuz();
        System.out.println();
        autobuz.dezaboneazaCalator(calator1);
        ((Autobuz)autobuz).notificaPornireAutbuz();

    }
}