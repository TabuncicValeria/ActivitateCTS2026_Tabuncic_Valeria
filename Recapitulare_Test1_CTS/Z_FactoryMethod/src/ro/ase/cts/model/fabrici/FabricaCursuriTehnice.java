package ro.ase.cts.model.fabrici;

import ro.ase.cts.model.clase.*;
import ro.ase.cts.model.enums.TipCurs;
import ro.ase.cts.model.enums.TipCursTehnic;

public class FabricaCursuriTehnice implements FabricaCursuri{
    @Override
    public ICourse creareCursuri(TipCurs tip, String titlu, int durataOre, double costBaza) {
        TipCursTehnic tipCursTehnic=(TipCursTehnic) tip;
        switch(tipCursTehnic){
            case JAVA :
                return new JavaCourse(titlu,durataOre,costBaza);
            case PYTHON:
                return new PythonCourse(titlu,durataOre,costBaza);
            case DEVOPS:
                return new DevopsCourse(titlu,durataOre,costBaza);
            default:
                throw new IllegalArgumentException("Curs Tehnic neidentificat!");

        }
    }
}
