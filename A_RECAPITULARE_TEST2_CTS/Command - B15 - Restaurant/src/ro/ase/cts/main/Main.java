package ro.ase.cts.main;

import ro.ase.cts.clase.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Command - B15 - Restaurant");
        ICommand comandaOcupare=new OcupareMasa(new Masa(1));
        ICommand comandaRezervare=new RezervareMasa(new Masa(2));
        Operator operator=new Operator();
        operator.adaugaComanda(comandaOcupare);
        operator.adaugaComanda(comandaRezervare);

        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();

    }
}