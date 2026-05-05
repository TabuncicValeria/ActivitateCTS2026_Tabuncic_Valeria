package ro.ase.cts.main;

import ro.ase.cts.clase.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("COMMAND - spital");
        PersonalSpital medic=new Medic("Plop Ion");
        PersonalSpital asistenta=new Asistenta("Gheorghiu Ana");
        Pacient p1=new Pacient("Enciu Alex");
        Pacient p2=new Pacient("Soare Catalin");

        Command comanda1=new Internare(medic,p1);
        Command comanda2=new Tratare(asistenta,p2);
        Operator operator=new Operator();
        operator.inregistreaza(comanda1);
        operator.inregistreaza(comanda2);
        operator.executaFisa();
        operator.inregistreaza(new Tratare(asistenta,new Pacient("Sandu Daniel")));
        operator.executaFisa();


    }
}