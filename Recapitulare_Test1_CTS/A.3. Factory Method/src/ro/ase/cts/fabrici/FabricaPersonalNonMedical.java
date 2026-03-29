package ro.ase.cts.fabrici;


import ro.ase.cts.clase.PersonalSpital;
import ro.ase.cts.clase.Registrator;
import ro.ase.cts.clase.Secretar;
import ro.ase.cts.enums.TipPersonal;
import ro.ase.cts.enums.TipPersonalNonMedical;

public class FabricaPersonalNonMedical implements FabricaPersonal {
    @Override
    public PersonalSpital crearePersonal(TipPersonal tip, String nume, String telefon, int aniExperienta, double salariu) {
        TipPersonalNonMedical tipPersonalNonMedical=(TipPersonalNonMedical) tip;
        switch(tipPersonalNonMedical){
            case SECRETAR:
                return new Secretar(nume,telefon,aniExperienta,salariu);
            case REGISTRATOR:
                return new Registrator(nume,telefon,aniExperienta,salariu);
            default:
                throw new IllegalArgumentException("Tip personal non medical neidentificat!");
        }

    }
}
