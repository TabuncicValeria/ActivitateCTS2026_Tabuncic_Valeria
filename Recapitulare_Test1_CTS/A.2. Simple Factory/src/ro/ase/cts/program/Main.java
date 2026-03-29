package ro.ase.cts.program;

import ro.ase.cts.clase.FabricaPersonalSpital;
import ro.ase.cts.clase.PersonalSpital;
import ro.ase.cts.clase.TipPersonalSpital;

public class Main {
    public static void main(String[] args) {
        FabricaPersonalSpital fabrica=new FabricaPersonalSpital();
        PersonalSpital medic=fabrica.getPersonal(TipPersonalSpital.MEDIC,"Tonciu Alin",10,10000);
        PersonalSpital asistent=fabrica.getPersonal(TipPersonalSpital.ASISTENT,"Calin Camelia",5,5000);
        PersonalSpital brancardier=fabrica.getPersonal(TipPersonalSpital.BRANCARDIER,"Tonciu George",7,6500);
        medic.afisareDescriere();
        asistent.afisareDescriere();
        brancardier.afisareDescriere();

    }
}