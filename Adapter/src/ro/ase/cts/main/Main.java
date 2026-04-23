package ro.ase.cts.main;

import ro.ase.cts.clase.spital.Medicament;
import ro.ase.cts.clase.spital.MedicamentAdapter;

public class Main {
    private static void procuraMedicament(ro.ase.cts.clase.farmacie.Medicament medicament)
    {
        medicament.cumparaMedicament();
    }
    public static void main(String[] args) {

        Medicament medicamentSpital=new Medicament("Arbidol reteta",10);
        ro.ase.cts.clase.farmacie.Medicament medicamentFarmacie=new  ro.ase.cts.clase.farmacie.Medicament("Nurofen");

        medicamentSpital.achizitioneazaMedicament();
        medicamentFarmacie.cumparaMedicament();
        procuraMedicament(medicamentFarmacie);
        //procuraMedicament(medicamentSpital);

        MedicamentAdapter medicamentAdapter=new MedicamentAdapter(medicamentSpital);
        procuraMedicament(medicamentAdapter);


    }
}