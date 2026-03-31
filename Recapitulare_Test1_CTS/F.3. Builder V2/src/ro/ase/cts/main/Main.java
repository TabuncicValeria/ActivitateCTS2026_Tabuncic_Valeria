package ro.ase.cts.main;

import ro.ase.cts.clase.AutobuzLinie;
import ro.ase.cts.clase.AutobuzLinieBuilder;

/*F.3.	Pentru obiectele de tipul AutobuzLinie se doreste ca in momentul in care au fost create obiectele de acest tip
 sa nu mai poata fi modificate. De asemenea pentru crearea unui obiect de tipul AutobuzLinie trebuie precizat modelul
  de autobuz folosit, soferul care il va conduce, daca va avea opriri la capat de linie, daca deschide usile in fiecare
  statie fara ca pasagerii sa solicite acest lucru, textul afisat de ecranul derulator si alte elemente. Unele atribute
   sunt optionale avand o valoare prestabilita. Se doreste implementarea modulului care se va ocupa de initializarea
   acestor obiecte, nefiind necesara introducerea atributelor optionale, iar obiectul odata creat sa nu mai poata fi modificat. */
public class Main {
    public static void main(String[] args) {

        System.out.println("Builder Versiunea 2 - GIT ");
        AutobuzLinie a1=new AutobuzLinieBuilder("Opel Astra 12","Cernut Ion").setAreOpririLaCapat(true).setAreOpririLaCapat(true).build();
        System.out.println(a1);
        AutobuzLinie a2=new AutobuzLinieBuilder("Opel 132","Tonciu Alex").build();
        System.out.println(a2);
    }
}