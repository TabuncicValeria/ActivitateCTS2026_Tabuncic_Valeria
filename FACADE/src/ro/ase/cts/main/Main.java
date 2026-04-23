package ro.ase.cts.main;

import ro.ase.cts.clase.Medic;
import ro.ase.cts.clase.Pacient;
import ro.ase.cts.clase.Salon;
import ro.ase.cts.clase.Spital;

public class Main {
    public static void main(String[] args) {
        Pacient pacient=new Pacient("Popescu Matei",7);
        Salon salon=new Salon();
        Medic medic=new Medic();

        if(pacient.getGravitate()>6){
            if (medic.areInregistratPacientul(pacient))
            {
                int patLiber= salon.getPatLiber();
                if(patLiber!=-1){
                    System.out.println("Pacientul "+pacient.getNume()+" este internat in patul "+patLiber+".");
                    salon.ocupaPat(patLiber);
                }
            }
        }

        Pacient pacient1=new Pacient("Ion",2);
        Pacient pacient2 = new Pacient("Miruna", 9);
        Pacient pacient3 = new Pacient("Denisa", 6);

        Spital spital = new Spital(medic, salon);
        spital.internarePacient(pacient1);
        spital.internarePacient(pacient2);
        spital.internarePacient(pacient3);
    }
}