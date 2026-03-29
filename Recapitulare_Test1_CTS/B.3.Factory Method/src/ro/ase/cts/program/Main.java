package ro.ase.cts.program;

import ro.ase.cts.clase.FelMancare;
import ro.ase.cts.enums.TipDesert;
import ro.ase.cts.enums.TipSupa;
import ro.ase.cts.fabrici.FabricaDeserturi;
import ro.ase.cts.fabrici.FabricaFelMancare;
import ro.ase.cts.fabrici.FabricaSupe;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Rezolvare B.3. - Factory Method");
        FabricaFelMancare fabrica;

        fabrica=new FabricaSupe();
        FelMancare supaLegume=fabrica.pregatireFelMancare(TipSupa.LEGUME,350,20,190);
        FelMancare supaCiuperci=fabrica.pregatireFelMancare(TipSupa.CIUPERCI,400,23,210);
        FelMancare supaVita=fabrica.pregatireFelMancare(TipSupa.VITA,350,28,250);

        fabrica=new FabricaDeserturi();
        FelMancare papanasi= fabrica.pregatireFelMancare(TipDesert.PAPANASI,200,22,450);
        FelMancare clatite=fabrica.pregatireFelMancare(TipDesert.CLATITE,180,17,310);
        FelMancare cheesecake=fabrica.pregatireFelMancare(TipDesert.CHEESECAKE,250,30,500);

        System.out.println("Supele solicitate de clienti");
        supaLegume.afisareDescriere();
        supaCiuperci.afisareDescriere();
        supaVita.afisareDescriere();
        System.out.println("\nDeserturile solicitate de clienti:");
        papanasi.afisareDescriere();
        clatite.afisareDescriere();
        cheesecake.afisareDescriere();




    }
}