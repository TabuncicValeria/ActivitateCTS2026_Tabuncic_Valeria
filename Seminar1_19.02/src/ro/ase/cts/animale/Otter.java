package ro.ase.cts.animale;

public class Otter extends Animal{
    private String tipMediu;

    @Override
    public void eat(String numeZooKeeper) {
        System.out.println("Zookeeper-ul "+numeZooKeeper+" hraneste vidra "+super.name+" cu "+super.food);
    }

    public Otter(String name, int age, String food, String tipMediu) {
        super(name, age, food);
        this.tipMediu = tipMediu;
    }
}