package ro.ase.cts.program;

import ro.ase.cts.clase.FabricaSupe;
import ro.ase.cts.clase.Supa;
import ro.ase.cts.clase.TipSupa;

public class Main {
    public static void main(String[] args) {
        FabricaSupe fabricaSupe=new FabricaSupe();
        Supa supa1=fabricaSupe.creeazaSupa(TipSupa.LEGUME);
        Supa supa2=fabricaSupe.creeazaSupa(TipSupa.CIUPERCI);
        Supa supa3=fabricaSupe.creeazaSupa(TipSupa.VITA);

        supa1.prepara();
        supa2.prepara();
        supa3.prepara();
    }
}