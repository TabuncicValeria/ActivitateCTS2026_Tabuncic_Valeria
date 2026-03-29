package ro.ase.cts.program;

import ro.ase.cts.clase.RetetaMedicament;

public class Main {
    /*A.4.	Spitalul are în dotare și un laborator în care mai mulți chimiști produc diferite rețete pentru medicamente.
     În momentul în care o rețetă este produsă trebuie ținut cont de cantitățile din soluțiile care sunt folosite.
     Dacă o rețetă este creată este recomandat să fie folosită pentru crearea viitoarelor medicamente fără a se trece
     prin procesul de creare al rețetei. Să se implementeze modulul care facilitează crearea de noi obiecte de rețete
     fără a fi nevoie de apelul constructorului.  */
    public static void main(String[] args) {
        System.out.println("A.4. Prototype");

        RetetaMedicament medicament1=new RetetaMedicament("Fasconal","Fasconal Forte",20);
        RetetaMedicament medicamentCopie=medicament1.copiaza();

        medicament1.afisareDescriere();
        medicamentCopie.afisareDescriere();


    }
}