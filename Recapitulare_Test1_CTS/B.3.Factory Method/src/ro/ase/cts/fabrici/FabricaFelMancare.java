package ro.ase.cts.fabrici;

import ro.ase.cts.clase.FelMancare;
import ro.ase.cts.enums.TipFelMancare;

public interface FabricaFelMancare {
    FelMancare pregatireFelMancare(TipFelMancare tip,int gramaj,double pret, int calorii);
}
