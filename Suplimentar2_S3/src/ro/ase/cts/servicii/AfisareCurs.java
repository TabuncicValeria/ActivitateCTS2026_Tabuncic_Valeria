package ro.ase.cts.servicii;

import ro.ase.cts.clase.Curs;
import ro.ase.cts.clase.Student;

public class AfisareCurs {
    public void afiseazaDetaliiCurs(Curs curs)
    {
        if(curs==null)
        {
            System.out.println("Cursul nu a fost identificat!");
            return;
        }
        System.out.println("Curs: "+curs.getNumeCurs());
        System.out.println("Credite: "+curs.getCredite());
        System.out.println("Nr. studenti: "+curs.getNumarStudenti());
        System.out.println("Lista studenti: ");
        for (Student student: curs.getStudenti())
        {
            System.out.println(" - "+student);
        }
    }
}
