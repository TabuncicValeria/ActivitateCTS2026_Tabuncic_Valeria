package ro.ase.cts.main;

import ro.ase.cts.model.AbonamentAbstract;
import ro.ase.cts.model.FabricaAbonamente;
import ro.ase.cts.model.ISubscription;
import ro.ase.cts.model.TipAbonament;

public class Main {
    public static void main(String[] args) {

        System.out.println("Simple Factory");
        FabricaAbonamente fabrica=new FabricaAbonamente();

        ISubscription a1=fabrica.creareAbonament(TipAbonament.FAMILIY,"Family",4,120);
        ISubscription a2=fabrica.creareAbonament(TipAbonament.FREE,"Free",1,0);
        a1.activeaza();
        a2.activeaza();
        System.out.println("Pret a1: "+a1.calculeazaPretLunar());

        System.out.println(a1.getDescriere());
        System.out.println(a2.getDescriere());




    }
}