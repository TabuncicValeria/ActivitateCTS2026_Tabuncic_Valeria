package ro.ase.cts.main;

import ro.ase.cts.clase.DecoratorNotaFelicitareSiDiscount;
import ro.ase.cts.clase.INotaDePlata;
import ro.ase.cts.clase.NotaDePlata;

public class Main {
    public static void main(String[] args) {

        /*B.7.	Cu ocazia sărbătorilor de sfârșit de an managerul restaurantului dorește ca atunci când este printat
        o notă să se printeze și o felicitare de la Mulți ani pentru client. Se dorește adăugarea acestei noi
         funcționalități pentru clasa NotaDePlata la printare. De asemenea sa se adauge un discount de 10%.  */
        System.out.println("Decorator - B7");
        INotaDePlata nota1=new NotaDePlata(4,250);
        System.out.println("\nNota Initiala: ");
        nota1.printeazaNota();
        System.out.println("\nNota Decorata: ");
        INotaDePlata notaDecorata=new DecoratorNotaFelicitareSiDiscount(nota1,10);
        notaDecorata.printeazaNota();
    }
}