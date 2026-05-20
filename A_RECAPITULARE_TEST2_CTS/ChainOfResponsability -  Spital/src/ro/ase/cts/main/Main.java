package ro.ase.cts.main;

import ro.ase.cts.clase.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("ChainOfResponsability - Spital");

        PacientHandler medicDeFamilie=new MedicDeFamilie();
        PacientHandler sectieInvestigatii =new SectieDeInvestigatii();
        PacientHandler terapieIntensiva=new TerapieIntensiva();
        PacientHandler altSpital=new AltSpital();

        medicDeFamilie.setPacientHandler(sectieInvestigatii);
        sectieInvestigatii.setPacientHandler(terapieIntensiva);
        terapieIntensiva.setPacientHandler(altSpital);

        Pacient p1=new Pacient("Toma Alin",2);
        Pacient p2=new Pacient("Ursu Daniel",5);
        Pacient p3=new Pacient("Pop Ionela",8);
        Pacient p4=new Pacient("Tiberiu Simona",12);


        System.out.println(medicDeFamilie.directioneazaPacient(p1));
        System.out.println(medicDeFamilie.directioneazaPacient(p2));
        System.out.println(medicDeFamilie.directioneazaPacient(p3));
        System.out.println(medicDeFamilie.directioneazaPacient(p4));

    }
}