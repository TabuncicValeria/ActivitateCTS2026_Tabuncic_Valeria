package ro.ase.cts.clase;

import ro.ase.cts.clase.animale.Lion;
import ro.ase.cts.clase.animale.Otter;
import ro.ase.cts.clase.animale.Zebra;
import ro.ase.cts.clase.zoo.ZOO;
import ro.ase.cts.clase.zoo.ZooKeeper;

public class Seminar1{
    public static void main(String args[])
    {
        ZooKeeper zooKeeper=new ZooKeeper("Popescu Andrei");

        ZOO zoo=new ZOO("Gradina ZOO Nationala",zooKeeper);
        zoo.addAnimal(new Lion("Leul Nobil",2,"carne proaspata",100));
        zoo.addAnimal(new Lion("Leul Alb",5,"carne exportata",150));
        zoo.addAnimal(new Zebra("Zebra Nr1",1,"iarba",186));
        zoo.addAnimal(new Zebra("Zebra Nr2",2,"fan",256));
        zoo.addAnimal(new Otter("Vidra Nr1",7,"peste","balta"));

        zoo.feedAllAnimals();

    }

}