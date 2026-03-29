package ro.ase.cts.program;

import ro.ase.cts.builder_v1.Rezervare;
import ro.ase.cts.builder_v1.RezervareBuilderV1;
import ro.ase.cts.builder_v2.RezervareBuilderV2;
import ro.ase.cts.builder_v3.Rezervare3;

public class Main {
    public static void main(String[] args) {

        System.out.println("Versiunea 1-TESTARE");
        Rezervare rezervare11=new RezervareBuilderV1("Plop Andrei","0734432142")
                .setAsezareLaGeam(true).setScauneErgonomice(true).build();
        Rezervare rezervare21=new RezervareBuilderV1("Dinu Radu","0798654187")
                .setMuzicaAmbientalaPersonalizata(true).setGenMuzica("Rock").build();
        Rezervare rezervare31=new RezervareBuilderV1("Tabuncic Valeria","0721365890").build();
        System.out.println(rezervare11);
        System.out.println(rezervare21);
        System.out.println(rezervare31);

        System.out.println("Versiunea 2-TESTARE");
        Rezervare rezervare12=new RezervareBuilderV2("Popa Andy","0735433442")
                .setAsezareLaGeam(true).setScauneErgonomice(true).build();
        Rezervare rezervare22=new RezervareBuilderV2("Tabrea Olga","0798176187")
                .setMuzicaAmbientalaPersonalizata(true).setGenMuzica("Rock").build();
        Rezervare rezervare32=new RezervareBuilderV2("Cosma Crina","0721365987").build();
        System.out.println(rezervare12);
        System.out.println(rezervare22);
        System.out.println(rezervare32);

        System.out.println("Versiunea 3-TESTARE");
        Rezervare3 rezervare13=Rezervare3.builder("Plop Daniel","0735433442")
                .setAsezareLaGeam(true).setScauneErgonomice(true).build();
        Rezervare3 rezervare23=Rezervare3.builder("Corbea Eugen","0798176187")
                .setMuzicaAmbientalaPersonalizata(true).setGenMuzica("Rock").build();
        Rezervare3 rezervare33=Rezervare3.builder("Olaru Mihail","0721365987").build();
        System.out.println(rezervare13);
        System.out.println(rezervare23);
        System.out.println(rezervare33);

    }
}