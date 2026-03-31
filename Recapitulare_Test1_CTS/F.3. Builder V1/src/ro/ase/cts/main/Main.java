package ro.ase.cts.main;

import ro.ase.cts.clase.AutobuzLinie;
import ro.ase.cts.clase.AutobuzLinieBuilder;

public class Main {
    public static void main(String[] args) {

        System.out.println("Builder - V1 - pp ca nu vreau sa am obiectele imutabile");
        AutobuzLinie a1=new AutobuzLinieBuilder("Opel Astra 12","Cernut Ion").setAreOpririLaCapat(true).setAreOpririLaCapat(true).build();
        System.out.println(a1);
        AutobuzLinie a2=new AutobuzLinieBuilder("Opel 132","Tonciu Alex").build();
        System.out.println(a2);
    }
}