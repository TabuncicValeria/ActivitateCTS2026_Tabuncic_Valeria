package ro.ase.cts.main;

import ro.ase.cts.lazy.Hotel;

public class main {
    public static void main(String[] args)
    {
        Hotel hotel1= Hotel.getInstance("Hotelul1",4,2);
        Hotel hotel2= Hotel.getInstance("Hotelul2",4,4);

        hotel1.afisareInchiriereCamera();
        hotel1.afisareInchiriereCamera();

        hotel2.afisareInchiriereCamera();
        hotel2.afisareInchiriereCamera();

    }
}
