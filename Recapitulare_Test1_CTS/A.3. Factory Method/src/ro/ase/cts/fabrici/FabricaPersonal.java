package ro.ase.cts.fabrici;

import ro.ase.cts.clase.PersonalSpital;
import ro.ase.cts.enums.TipPersonal;

public interface FabricaPersonal  {
    PersonalSpital crearePersonal(TipPersonal tip, String nume, String telefon, int aniExperienta, double salariu);
}
