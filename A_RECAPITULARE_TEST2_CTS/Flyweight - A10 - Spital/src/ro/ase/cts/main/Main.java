package ro.ase.cts.main;

import ro.ase.cts.clase.IPacient;
import ro.ase.cts.clase.Pacient;
import ro.ase.cts.clase.PacientFactory;
import ro.ase.cts.clase.Salon;

public class Main {
    public static void main(String[] args) {

        System.out.println("Flyweight - A10 - Spital");
        PacientFactory pacientFactory=new PacientFactory();
        Salon s1=new Salon(100,3,10);
        Salon s2=new Salon(101,5,6);
        IPacient p1= pacientFactory.getPacient("Plop Daniel", "+40727312213", "Bd. Soarelui 87");
        IPacient p2=pacientFactory.getPacient("Popa Arina", "+40765987123","Str. Sergent 123");
        p1.afiseazaInternare(s1);
        p2.afiseazaInternare(s2);
        System.out.println("Au fost inregistrati "+pacientFactory.getNumarPacienti()+" pacienti.");
    }
}