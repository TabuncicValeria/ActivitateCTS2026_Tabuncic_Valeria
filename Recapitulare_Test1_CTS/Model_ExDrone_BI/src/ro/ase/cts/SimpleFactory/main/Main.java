package ro.ase.cts.SimpleFactory.main;

import ro.ase.cts.SimpleFactory.model.AbstractModule;
import ro.ase.cts.SimpleFactory.model.ModuleFactory;
import ro.ase.cts.SimpleFactory.model.ModuleType;

public class Main {
    /*3.	Drona poate fi accesorizată cu diferite module (vedere pe timp de noapte, GPS tracking,
    cameră de înaltă rezoluție, urmărire inteligentă, baterie suplimentară etc.). Framework-ul modulelor extinde clasa
    AbstractModule. Deoarece fiecare modul are atribute unice (2-3 atribute suplimentare față de cele din AbstractModule),
    iar acestea se pot schimba în viitor, implementează un strat intermediar care să permită altor dezvoltatori să
    creeze/utilizeze module diferite într-un mod simplificat și independent de tipul de modul. */
    public static void main(String[] args) {
        ModuleFactory factory=new ModuleFactory();
        AbstractModule m1= factory.getModule(ModuleType.NIGHT_VISION,
                "Night Vision Pro",
                "Modul pentru vedere pe timp de noapte",
                1200f);
        AbstractModule m2= factory.getModule( ModuleType.GPS_TRACKING,
                "GPS Tracker X",
                "Modul de urmarire GPS in timp real",
                850f);
        AbstractModule m3= factory.getModule( ModuleType.HIGH_RESOLUTION_CAMERA,
                "4K Camera",
                "Camera de inalta rezolutie pentru drona",
                1500f);
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
    }
}
