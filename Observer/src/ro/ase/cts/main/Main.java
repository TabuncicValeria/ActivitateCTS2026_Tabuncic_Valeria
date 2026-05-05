package ro.ase.cts.main;

import ro.ase.cts.clase.Pacient;
import ro.ase.cts.clase.PacientAbonat;
import ro.ase.cts.clase.Spital;
import ro.ase.cts.clase.iSpital;

public class Main {
    public static void main(String[] args) {


        Pacient pacient1=new PacientAbonat("Tonciu Alex",20);
        Pacient pacient2=new PacientAbonat("Toma Alexandra",23);
        Pacient pacient3=new PacientAbonat("Tornea Ana",40);
        Pacient pacient4=new PacientAbonat("Corbu Daniel",50);

        iSpital spital=new Spital("Regional");
        spital.aboneazaPacient(pacient1);
        spital.aboneazaPacient(pacient2);
        spital.aboneazaPacient(pacient3);
        spital.aboneazaPacient(pacient4);

        ((Spital)spital).notificaVirus();
        System.out.println();
        ((Spital)spital).notificaEpidemie();



    }
}