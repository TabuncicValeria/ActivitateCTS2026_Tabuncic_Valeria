package ro.ase.cts.main;

import ro.ase.cts.clase.Calator;
import ro.ase.cts.clase.PlataCardCalatorie;
import ro.ase.cts.clase.PlataSMS;

public class Main {
    public static void main(String[] args) {

        System.out.println("Strategy - F10 - STB");
        Calator calator=new Calator("Tabuncic Valeria","STB");
        calator.plateste();

        calator.setModPlata(new PlataSMS());
        calator.plateste();

        calator.setModPlata(new PlataCardCalatorie());
        calator.plateste();
    }
}