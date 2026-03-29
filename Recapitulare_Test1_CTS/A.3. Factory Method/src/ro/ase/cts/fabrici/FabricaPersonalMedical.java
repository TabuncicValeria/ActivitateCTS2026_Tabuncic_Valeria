package ro.ase.cts.fabrici;

import ro.ase.cts.clase.Asistent;
import ro.ase.cts.clase.Brancardier;
import ro.ase.cts.clase.Medic;
import ro.ase.cts.clase.PersonalSpital;
import ro.ase.cts.enums.TipPersonal;
import ro.ase.cts.enums.TipPersonalMedical;

public class FabricaPersonalMedical implements FabricaPersonal{
    @Override
    public PersonalSpital crearePersonal(TipPersonal tip, String nume, String telefon, int aniExperienta, double salariu) {
        TipPersonalMedical tipPersonalMedical=(TipPersonalMedical) tip;

        switch(tipPersonalMedical){
            case BRANCARDIER:
                return new Brancardier(nume,telefon,aniExperienta,salariu);
            case MEDIC:
                return new Medic(nume,telefon,aniExperienta,salariu);
            case ASISTENT:
                return new Asistent(nume,telefon,aniExperienta,salariu);
            default:
                throw new IllegalArgumentException("Tipul identificat nu se incadreaza la categoria Personal Medical!");
        }
    }
}
