package ro.ase.cts.clase.zoo;

import ro.ase.cts.clase.animale.Animal;

import java.util.ArrayList;
import java.util.List;

public class ZOO{
    private String name;
    private ZooKeeper zooKeeper;
    private List<Animal> animale;

    public ZOO(String name, ZooKeeper zooKeeper) {
        this.name = name;
        this.zooKeeper = zooKeeper;
        this.animale = new ArrayList<>();
    }

    public void addAnimal(Animal animal)
    {
        animale.add(animal);
    }
    public void feedAllAnimals(){
        for(Animal a:animale)
        {
            zooKeeper.feedAnimal(a);
        }
    }


}