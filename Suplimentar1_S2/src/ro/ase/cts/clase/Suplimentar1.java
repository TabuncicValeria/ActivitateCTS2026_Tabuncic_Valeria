package ro.ase.cts;

import ro.ase.cts.hotel.*;

public class Suplimentar1 {
    public static void main(String[] args) {
       Hotel hotel=new Hotel("Hotel Bucuresti");
       Camera camera1=new Camera(205,2,250);
       Camera camera2=new Camera(206,3,350);
       Camera camera3=new Camera(207,4,450);
       hotel.adaugaCamera(camera1);
       hotel.adaugaCamera(camera2);
       hotel.adaugaCamera(camera3);

       Client client1=new Client("C1","Ana Iorga","anaio@gmail.com");
       Client client2=new Client("C2","Denis Matros","matrooDen@gmail.com");
       Rezervare rezervare1=new Rezervare("R1",client1,camera1);
       Rezervare rezervare2=new Rezervare("R2",client2,camera3);
       hotel.adaugaRezervare(rezervare1);
       hotel.adaugaRezervare(rezervare2);
       rezervare1.confirma();

       hotel.afiseazaDetalii();

       System.out.println("POLIMORFISM\n");
       rezervare1.adaugaServiciu(new Cazare(camera1, rezervare1.getCheckIn(), rezervare1.getCheckOut()));
       rezervare1.adaugaServiciu(new MicDejun(45, 2, 3));
       rezervare1.setReducere(new ReducereProcentuala(10));

       System.out.println(rezervare1);


    }
}