package ro.ase.cts.main;

import ro.ase.cts.clase.Autobuz;
import ro.ase.cts.clase.LinieFactory;

public class Main {
    public static void main(String[] args) {

        System.out.println("FLYWEIGHT - F9");
        Autobuz autobuz1=new Autobuz("Electric", 2015,30);
        Autobuz autobuz2=new Autobuz("Rapid", 2020,35);
        Autobuz autobuz3=new Autobuz("Curse", 2023,70);

        LinieFactory linieFactory=new LinieFactory();
        linieFactory.getLinie(102,"CFR","Pantelimon").afiseazaAutobuzLinie(autobuz1);
        linieFactory.getLinie(103,"Romana", "Universitate").afiseazaAutobuzLinie(autobuz2);
        linieFactory.getLinie(102,"Vitan","Energeticienilor").afiseazaAutobuzLinie(autobuz3);//linia 102 e salvata o singura data in memorie
    }
}