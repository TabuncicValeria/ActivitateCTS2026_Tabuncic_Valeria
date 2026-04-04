package ro.ase.cts.model.fabrici;

import ro.ase.cts.model.clase.ICourse;
import ro.ase.cts.model.clase.LeadershipCourse;
import ro.ase.cts.model.clase.ManagementCourse;
import ro.ase.cts.model.enums.TipCurs;
import ro.ase.cts.model.enums.TipCursBussines;

public class FabricaCursuriBussines implements FabricaCursuri{
    @Override
    public ICourse creareCursuri(TipCurs tip, String titlu, int durataOre, double costBaza) {
        TipCursBussines tipCursBussines=(TipCursBussines) tip;
        switch(tipCursBussines){
            case MANAGEMENT :
                return new ManagementCourse(titlu,durataOre,costBaza);
            case LEADERSHIP:
                return new LeadershipCourse(titlu,durataOre,costBaza);
            case NEGOTIATION:
                return new LeadershipCourse(titlu,durataOre,costBaza);
            default:
                throw new IllegalArgumentException("Curs de bussines neidentificat!");

        }
    }
}
