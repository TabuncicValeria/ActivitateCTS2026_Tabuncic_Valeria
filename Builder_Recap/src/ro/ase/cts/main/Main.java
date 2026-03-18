package ro.ase.cts.main;

import ro.ase.cts.builder_V1.Rezervare;
import ro.ase.cts.builder_V1.RezervareBuilder;
import ro.ase.cts.builder_V2.Rezervare2;
import ro.ase.cts.builder_V2.RezervareBuilder2;
import ro.ase.cts.builder_V3.Rezervare3;

public class Main {

    public static void main(String[] args)
    {
        //versiunea 1 - builder
        System.out.println("Verisunea 1");
        Rezervare rezervare1=new RezervareBuilder("Tabuncic Valeria").setAsezareLaGeam(true).setDecorareMasa(true).setMuzicaAmbientalaPersonalizata(true)
                .setGenMuzica("Pop").build();
        Rezervare rezervare2=new RezervareBuilder("Sandu Corneliu")
                .setAsezareLaGeam(true).build();
        Rezervare rezervare3=new RezervareBuilder("Timosco Adelina").build();
        System.out.println(rezervare1);
        System.out.println(rezervare2);
        System.out.println(rezervare3);

        //versiunea2
        System.out.println("Versiunea 2");
        Rezervare2 rezervare12=new RezervareBuilder2("Tomita Denis").build();
        Rezervare2 rezervare13=new RezervareBuilder2("Apostu Delia")
                .setAsezareLaGeam(true).setDecorareMasa(true).setGenMuzica("Rock").build();
        System.out.println(rezervare12);
        System.out.println(rezervare13);

        //versiunea3
        System.out.println("Versiunea 3");
        Rezervare3 rezervare31=new Rezervare3.RezervareBuilder3("Vacaru Flavius")
                .setAsezareLaGeam(true).setDecorareMasa(true).setGenMuzica("Rock").build();
        System.out.println(rezervare31);
    }
}