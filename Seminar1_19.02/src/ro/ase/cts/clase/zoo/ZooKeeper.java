package ro.ase.cts.clase.zoo;

import ro.ase.cts.clase.animale.Animal;
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
