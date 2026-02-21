package ro.ase.cts.zoo;

import ro.ase.cts.animale.Animal;
public class ZooKeeper{
    private String nume;

    public void feedAnimal(Animal animal)
    {
        animal.eat(nume);
    }

    public ZooKeeper(String nume) {
        this.nume = nume;
    }
}
