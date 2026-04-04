package ro.ase.cts.Singleton.main;

import ro.ase.cts.Singleton.model.DroneConnection;

public class Main {
    /*1.	Modulul de conexiune al dronei trebuie să permită altor dezvoltatori să se conecteze la dispozitiv
    ținând cont de faptul că trebuie să existe o conexiune unică. Conexiunea trebuie să implementeze interfața
    IDroneConnection. Implementează modulul DroneConnection astfel încât să nu fie posibilă crearea a mai mult
    de o conexiune. */

    public static void main(String[] args) {
        System.out.println("Lazy Singleton");
        DroneConnection d1=DroneConnection.getInstanta("192.168.1.1",8080);
        DroneConnection d2=DroneConnection.getInstanta("10.0.0.1",8090);
        System.out.println("Sunt aceleasi obiecte? "+(d1==d2));

        // Testăm conexiunea
        d1.connect();
        d2.connect(); // nu ar trebui să reconecteze

        // Afișăm detalii
        System.out.println(d1);
        System.out.println(d2);

        // Deconectare
        d2.disconnect();
        d1.disconnect(); // deja deconectat
    }
}