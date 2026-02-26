package ro.ase.cts.clase.animale;

//o clasa abstracta - nu se instantiaza direct (nu pot face new Animal())
public abstract class Animal{
    protected String name;// se va folosi direct in clasele copil, fara getteri
    private int age;
    protected String food;
    public abstract void eat(String numeZooKeeper); //pt a fi apelata din exterior e public

    //constructor cu toti parametrii
    public Animal(String name, int age, String food) {
        this.name = name;
        this.age = age;
        this.food = food;
    }
}
