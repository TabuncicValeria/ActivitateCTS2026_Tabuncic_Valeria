package ro.ase.cts.main;

import ro.ase.cts.clase.UsaFata;
import ro.ase.cts.clase.UsaMijloc;
import ro.ase.cts.clase.UsaSpate;
import ro.ase.cts.clase.UsiAutobuz;

public class Main {
    public static void main(String[] args) {

        System.out.println("Facade - F5 - STB");
        UsaFata usaFata=new UsaFata();
        UsaMijloc usaMijloc=new UsaMijloc();
        UsaSpate usaSpate=new UsaSpate();

        UsiAutobuz usi=new UsiAutobuz(usaFata,usaMijloc,usaSpate);
        usi.deschideLaSolicitateToateUsile();
        System.out.println();
        usi.deschideFortatToateUsile();
    }
}