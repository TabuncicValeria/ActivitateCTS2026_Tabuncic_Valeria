package ro.ase.cts.model.fabrici;

import ro.ase.cts.model.clase.ICourse;
import ro.ase.cts.model.enums.TipCurs;

public interface FabricaCursuri {
    ICourse creareCursuri(TipCurs tip,String titlu, int durataOre, double costBaza);
}
