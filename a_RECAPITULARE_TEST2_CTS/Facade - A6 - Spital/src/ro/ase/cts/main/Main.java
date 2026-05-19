package ro.ase.cts.main;

import ro.ase.cts.clase.Medic;
import ro.ase.cts.clase.Pacient;
import ro.ase.cts.clase.Salon;
import ro.ase.cts.clase.Spital;

public class Main {
    public static void main(String[] args) {
        System.out.println("Facade - A6 - Spital");
        Medic medic=new Medic("Anatolie Melnic");
        Salon salon= new Salon();
        Pacient pacient1=new Pacient("Tiberiu Martin",6);
        Pacient pacient2=new Pacient("Alexandru Plop",3);
        Pacient pacient3=new Pacient("Anastasia Fulger",7);
        Spital spital=new Spital(medic, salon);
        spital.internarePacient(pacient1);
        spital.internarePacient(pacient2);
        spital.internarePacient(pacient3);
    }
}