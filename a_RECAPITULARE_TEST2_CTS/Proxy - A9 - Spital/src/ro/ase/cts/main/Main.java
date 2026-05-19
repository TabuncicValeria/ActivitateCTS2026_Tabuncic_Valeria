package ro.ase.cts.main;

import ro.ase.cts.clase.AbstractInternarePacient;
import ro.ase.cts.clase.Internare;
import ro.ase.cts.clase.InternareCuAsigurare;
import ro.ase.cts.clase.Pacient;

public class Main {
    public static void main(String[] args) {
        System.out.println("Proxy - A9 - SPITAL");

        Pacient pacient1=new Pacient("Tonciu Dorian","gripa",false);
        System.out.println("Internare Stadard:");
        AbstractInternarePacient internare=new Internare();
        internare.interneazaPacient(pacient1);
        System.out.println("Internare Proxy:");
        AbstractInternarePacient proxy=new InternareCuAsigurare(internare);
        proxy.interneazaPacient(pacient1);

        Pacient pacient2=new Pacient("Sandu Lorena","raceala",true);
        System.out.println("Internare Stadard:");
        AbstractInternarePacient internare1=new Internare();
        internare.interneazaPacient(pacient2);
        System.out.println("Internare Proxy:");
        AbstractInternarePacient proxy1=new InternareCuAsigurare(internare1);
        proxy.interneazaPacient(pacient2);

    }
}