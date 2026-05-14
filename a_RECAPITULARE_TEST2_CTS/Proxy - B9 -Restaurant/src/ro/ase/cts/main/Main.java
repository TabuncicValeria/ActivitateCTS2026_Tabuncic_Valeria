package ro.ase.cts.main;

import ro.ase.cts.clase.IRezervare;
import ro.ase.cts.clase.ProxyRezervare;
import ro.ase.cts.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
/*B.9.	Managerul restaurantului dorește ca atunci când cineva dorește să realizez e o rezervare sa fie
permisă doar dacă aceasta este realizată pentru minim 4 persoane. În sens contrar rezervarea nu este realizata,
iar persoanele sunt rugate să se prezinte la restaurant deoarece sunt suficiente locuri pentru mesele
de doua persoane. Sa se realizeze un nivel intermediar care sa condiționeze realizarea rezervărilor de
numărul de persoane.*/
        System.out.println("Proxy - B9 - Restaurant");
        IRezervare rezervare = new Rezervare(10);
        IRezervare proxyRezervare = new ProxyRezervare(rezervare);

        proxyRezervare.realizeazaRezervare("Plop Ana", 2);
        proxyRezervare.realizeazaRezervare("Irimescu Cristina", 4);
        proxyRezervare.realizeazaRezervare("Darii Dan", 6);
    }
}