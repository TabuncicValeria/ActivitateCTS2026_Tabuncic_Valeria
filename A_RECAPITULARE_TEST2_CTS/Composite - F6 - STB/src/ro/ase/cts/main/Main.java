package ro.ase.cts.main;

import ro.ase.cts.clase.Autobuz;
import ro.ase.cts.clase.GrupAutobuze;

public class Main {
    public static void main(String[] args) {

        System.out.println("Composite - F6 - STB");
        GrupAutobuze flota=new GrupAutobuze("Flota STB");
        GrupAutobuze grupMici=new GrupAutobuze("Gr. mici - 10 locuri");
        GrupAutobuze grupMedii=new GrupAutobuze("Gr. medii - 30 locuri");
        GrupAutobuze grupMari=new GrupAutobuze("Gr. mari - 50 locuri");

        Autobuz aMic1=new Autobuz("Mercedes", "Sprinter",10);
        Autobuz aMic2=new Autobuz("Opel", "Sprinter",10);
        Autobuz aMed1=new Autobuz("Ford", "Sprinter",30);
        Autobuz aMed2=new Autobuz("Mercedes", "Sprinter",29);
        Autobuz aMed3=new Autobuz("BMW", "Tranzit",30);
        Autobuz aMare1=new Autobuz("Ford", "Tranzit",50);
        Autobuz aMare2=new Autobuz("Dacia", "Tranzit",50);

        grupMici.adaugaNod(aMic1);
        grupMici.adaugaNod(aMic2);
        grupMedii.adaugaNod(aMed1);
        grupMedii.adaugaNod(aMed2);
        grupMedii.adaugaNod(aMed3);
        grupMari.adaugaNod(aMare1);
        grupMari.adaugaNod(aMare2);
        flota.adaugaNod(grupMici);
        flota.adaugaNod(grupMedii);
        flota.adaugaNod(grupMari);
        flota.afiseaza(" ");
        System.out.println();
        flota.stergeNod(grupMedii);
        flota.afiseaza(" ");


    }
}