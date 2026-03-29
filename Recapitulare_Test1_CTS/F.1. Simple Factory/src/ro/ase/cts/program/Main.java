package ro.ase.cts.program;

import ro.ase.cts.clase.FabricaMijlocTransport;
import ro.ase.cts.clase.MijlocTransport;
import ro.ase.cts.clase.TipMijlocTransport;

public class Main {
    public static void main(String[] args) {

        /*F.1.	Trebuie implementat un modul care sa creeze obiecte de tipul MijlocTransport: Autobuz, Tramvai, Troleibuz.
         Modulul trebuie sa ajute la crearea de obiecte de familia de clase MijlocTransport Tipurile de transport sunt
         salvate intr-un enum{Autobuz, Tramvai, Troleibuz}. */
        System.out.println("F.1 - Simple Factory");
        FabricaMijlocTransport fabrica=new FabricaMijlocTransport();
        MijlocTransport autobuz=fabrica.getMijlocTransport(TipMijlocTransport.AUTOBUZ,"AUTOBUZ S1","OPEL ASTRA","B123545");
        MijlocTransport troleibuz =fabrica.getMijlocTransport(TipMijlocTransport.TROLEIBUZ,"TROLEIBUZ REGIONAL","BMW","IF123890");
        MijlocTransport tramvai=fabrica.getMijlocTransport(TipMijlocTransport.TRAMVAI,"TRAMVAI NR 1","DACIA","CO123456");
        autobuz.afisareDescriere();
        tramvai.afisareDescriere();
        troleibuz.afisareDescriere();
    }
}