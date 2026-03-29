package ro.ase.cts.program;

import ro.ase.cts.clase.PersonalSpital;
import ro.ase.cts.enums.TipPersonalMedical;
import ro.ase.cts.enums.TipPersonalNonMedical;
import ro.ase.cts.fabrici.FabricaPersonal;
import ro.ase.cts.fabrici.FabricaPersonalMedical;
import ro.ase.cts.fabrici.FabricaPersonalNonMedical;

/*A.3.	În cadrul aplicației personalul spitalului este de mai multe tipuri: Brancardier, Asistent, Medic, Secretar, Registrator.
 Să se implementeze modulul care pune la dispoziției crearea de obiecte din familia obiectelor PersonalSpital stiind faptul ca
 personalul este împărțit in doua categorii: personal medical si personal non-Medical. */
public class Main {
    public static void main(String[] args)
    {
        System.out.println("A.3. Factory Method");
        FabricaPersonal fabrica;
        System.out.println("Fabrica personal Medical");
        fabrica=new FabricaPersonalMedical();
        PersonalSpital medic=fabrica.crearePersonal(TipPersonalMedical.MEDIC,"Tornea Daniel","+40712375196",15,15000);
        PersonalSpital asistent=fabrica.crearePersonal(TipPersonalMedical.ASISTENT,"Lo Lorena","+4065431276",2,4000);
        PersonalSpital brancardier=fabrica.crearePersonal(TipPersonalMedical.MEDIC,"Achile Tiberiu","+40712375196",12,8000);
        medic.afisareDescriere();
        asistent.afisareDescriere();
        brancardier.afisareDescriere();

        System.out.println("Fabrica personal non medical");
        fabrica=new FabricaPersonalNonMedical();
        PersonalSpital secretar=fabrica.crearePersonal(TipPersonalNonMedical.SECRETAR,"Popov Ligia","+40789651234",3,5000);
        PersonalSpital registrator=fabrica.crearePersonal(TipPersonalNonMedical.REGISTRATOR,"Alin Ala","+4087654123",20,10000);
        secretar.afisareDescriere();
        registrator.afisareDescriere();



    }
}