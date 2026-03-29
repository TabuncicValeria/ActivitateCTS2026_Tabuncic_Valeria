package ro.ase.cts.fabrici;

import ro.ase.cts.clase.CheeseCake;
import ro.ase.cts.clase.Clatite;
import ro.ase.cts.clase.FelMancare;
import ro.ase.cts.clase.Papanasi;
import ro.ase.cts.enums.TipDesert;
import ro.ase.cts.enums.TipFelMancare;

public class FabricaDeserturi implements FabricaFelMancare{
    @Override
    public FelMancare pregatireFelMancare(TipFelMancare tip, int gramaj, double pret, int calorii) {
        TipDesert tipDesert=(TipDesert) tip;
        switch(tipDesert){
            case CLATITE :
                return new Clatite(gramaj,pret,calorii);
            case PAPANASI:
                return new Papanasi(gramaj,pret,calorii);
            case CHEESECAKE:
                return new CheeseCake(gramaj, pret,calorii);
            default:
                throw new IllegalArgumentException("Tip desert neidentificat in meniul curent!");

        }
    }
}
