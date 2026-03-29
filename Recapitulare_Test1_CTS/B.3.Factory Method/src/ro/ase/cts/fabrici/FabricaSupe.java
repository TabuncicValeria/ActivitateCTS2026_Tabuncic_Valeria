package ro.ase.cts.fabrici;

import ro.ase.cts.clase.FelMancare;
import ro.ase.cts.clase.SupaCiuperci;
import ro.ase.cts.clase.SupaLegume;
import ro.ase.cts.clase.SupaVita;
import ro.ase.cts.enums.TipFelMancare;
import ro.ase.cts.enums.TipSupa;

public class FabricaSupe implements FabricaFelMancare{

    @Override
    public FelMancare pregatireFelMancare(TipFelMancare tip, int gramaj, double pret, int calorii) {

        TipSupa tipSupa=(TipSupa) tip;

        switch(tipSupa)
        {
            case LEGUME:
                return new SupaLegume(gramaj,pret,calorii);
            case CIUPERCI:
                return new SupaCiuperci(gramaj,pret,calorii);
            case VITA:
                return new SupaVita(gramaj,pret,calorii);
            default:
                throw new IllegalArgumentException("Tip de supa necunoscut!");

        }

    }
}
