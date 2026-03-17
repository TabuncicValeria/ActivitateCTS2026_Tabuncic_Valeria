package ro.ase.cts.main;

import ro.ase.cts.builder.Internare;
import ro.ase.cts.builder.InternareBuilder;
import ro.ase.cts.builder.InternareBuilderAlternativ;

public class Main {
    public static void main(String[] args)
    {
        Internare internare=new Internare(true,false,true,true,"Mihai Sandu");
        Internare internare2=new Internare(false,false,false,false,"Olga Vola");

        InternareBuilder builder=new InternareBuilder("Olga-Vola");
        Internare internare3=builder.build();

        InternareBuilder builder2=new InternareBuilder("Mihai Dimitriu");
        Internare internare4=builder2.setNume("Mihai Dimitriu").setArePatRabatabil(true).
                        setAreMicDejun(true).setArePapuciCamera(true).setAreHalat(false).build();

        System.out.println(internare3.toString());
        System.out.println(internare4.toString());

        InternareBuilderAlternativ builderAlternativ=new InternareBuilderAlternativ();
        builderAlternativ.setMicDejun(true);
        Internare internare101=builderAlternativ.build("Alina Maria");
        Internare internare102=builderAlternativ.build("Oana Popescu");
        Internare internare103=builderAlternativ.build("Albu Andreea");

        System.out.println(internare101.toString());
        System.out.println(internare102.toString());
        System.out.println(internare103.toString());



    }
}