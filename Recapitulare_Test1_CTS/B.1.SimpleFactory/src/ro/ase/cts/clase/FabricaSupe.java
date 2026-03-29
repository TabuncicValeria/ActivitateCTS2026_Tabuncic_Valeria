package ro.ase.cts.clase;

public class FabricaSupe {
    public Supa creeazaSupa(TipSupa tipSupa)
    {
        switch(tipSupa)
        {
            case LEGUME:
                return new SupaLegume();
            case CIUPERCI:
                return new SupaCiuperci();
            case VITA:
                return new SupaVita();
            default:
                throw new IllegalArgumentException("Tipul de supa solicitat nu exista in meniu si nu poate fi preparat!");

        }
    }
}
