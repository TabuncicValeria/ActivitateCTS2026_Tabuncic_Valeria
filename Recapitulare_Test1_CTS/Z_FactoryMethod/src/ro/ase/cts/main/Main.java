package ro.ase.cts.main;

import ro.ase.cts.model.clase.ICourse;
import ro.ase.cts.model.enums.TipCursBussines;
import ro.ase.cts.model.enums.TipCursTehnic;
import ro.ase.cts.model.fabrici.FabricaCursuri;
import ro.ase.cts.model.fabrici.FabricaCursuriBussines;
import ro.ase.cts.model.fabrici.FabricaCursuriTehnice;

public class Main {
    public static void main(String[] args) {
        System.out.println("Factory Method");
        FabricaCursuri fabrica;
        fabrica=new FabricaCursuriTehnice();
        ICourse c1=fabrica.creareCursuri(TipCursTehnic.JAVA,"Java C",20,1200);
        ICourse c2=fabrica.creareCursuri(TipCursTehnic.PYTHON,"PYTHON C",48,2000);
        ICourse c3=fabrica.creareCursuri(TipCursTehnic.DEVOPS,"Devops C",10,400);

        fabrica=new FabricaCursuriBussines();
        ICourse cb1=fabrica.creareCursuri(TipCursBussines.MANAGEMENT,"Managementul Relatiilor",10,300);
        ICourse cb2=fabrica.creareCursuri(TipCursBussines.NEGOTIATION,"Negocierea eficienta",10,300);
        ICourse cb3=fabrica.creareCursuri(TipCursBussines.LEADERSHIP,"Un lider bun",20,500);

        c1.afisareDetalii();
        c2.afisareDetalii();
        c3.afisareDetalii();
        cb1.afisareDetalii();
        cb2.afisareDetalii();
        cb3.desfasoaraCurs();



    }
}