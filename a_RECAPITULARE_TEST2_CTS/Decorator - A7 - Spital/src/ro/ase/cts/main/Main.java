package ro.ase.cts.main;

import ro.ase.cts.clase.Rezultat;
import ro.ase.cts.decorator.RezultatDecorator;
import ro.ase.cts.decorator.RezultatOnline;

public class Main {
    public static void main(String[] args) {

        System.out.println("Decorator - A7 -SPITAL");
        Rezultat rezultat=new Rezultat("Toma Alina","Unguru Anatol","12.05.2026");
        rezultat.printeazaRezultat();

        RezultatDecorator rezultatDecorator=new RezultatOnline(rezultat,"tomaAlina@gmail.com");
        rezultatDecorator.printeazaRezultat();
    }
}