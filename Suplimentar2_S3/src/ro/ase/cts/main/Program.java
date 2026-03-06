package ro.ase.cts.main;

import ro.ase.cts.clase.Asistent;
import ro.ase.cts.clase.Curs;
import ro.ase.cts.clase.Profesor;
import ro.ase.cts.clase.Student;
import ro.ase.cts.servicii.AfisareCurs;
import ro.ase.cts.servicii.ConfirmareCurs;

public class Program {
    public static void main(String[] args) {
        Profesor profesor = new Profesor("Tonciu Mihai", 45, "A0098976");
        Asistent asistent = new Asistent("Florea Maria", 29, "A0006543");

        Student student1 = new Student("Balan Cristina", 20, "1244");
        Student student2 = new Student("Timu Andrei", 21, "1245");
        Student student3 = new Student("Stan Elena", 22, "1247");

        Curs curs = new Curs("CTS", 6, profesor);
        curs.adaugaStudent(student1);
        curs.adaugaStudent(student2);
        curs.adaugaStudent(student3);

        ConfirmareCurs confirmareCurs = new ConfirmareCurs();
        AfisareCurs afisareCurs = new AfisareCurs();

        if (confirmareCurs.esteConfirmat(curs))
        {
            afisareCurs.afiseazaDetaliiCurs(curs);
            curs.getProfesor().preda();
        }
        else
        {
            System.out.println("Cursul nu este valid.");
        }
        asistent.preda();
    }
}