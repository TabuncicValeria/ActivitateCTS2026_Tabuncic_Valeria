package ro.ase.cts.main;

import ro.ase.cts.clase.IMedicamentFarmacie;
import ro.ase.cts.clase.MedicamentFarmacie;
import ro.ase.cts.clase.MedicamentSpitalAdapter;

public class Main {
    public static void main(String[] args) {

        System.out.println("Adapter - A5 - SPITAL");
        IMedicamentFarmacie medicamentFarmacie=new MedicamentFarmacie("Nospa");
        medicamentFarmacie.cumparaMedicament();

        IMedicamentFarmacie medicamentAdapter=new MedicamentSpitalAdapter("Augmentin","200",true);
        medicamentAdapter.cumparaMedicament();
    }
}