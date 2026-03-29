package ro.ase.cts.program;

import ro.ase.cts.clase.MijlocTransport;

public class Main {
    public static void main(String[] args) {

        /*F.2.	Pentru crearea de obiecte de tip Autobuz sunt consumate foarte multe resurse.
         Din acest motiv trebuie propusa o varianta prin care daca exista deja un obiect creat, sa fie folosit
         acest obiect pentru viitoarele obiecte, fara a mai fi nevoie de crearea de la 0 a obiectelor de tip Autobuz.
         Aceeasi regula se va aplica si pentru alte tipuri de mijloace de transport.
         */
        System.out.println("F.2. - Prototype");
        MijlocTransport autobuz=new MijlocTransport("Autobuz Seria E","Opel Vivaro","B1223455",12);
        MijlocTransport autobuzCopie=autobuz.copiaza();
        autobuz.afisareDescriere();
        autobuzCopie.afisareDescriere();
    }
}