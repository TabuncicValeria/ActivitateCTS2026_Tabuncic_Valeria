package ro.ase.cts.clase;

public class RetetaMedicament implements RetetaMedicamentPrototype{
    private String denumireMedicament;
    private String denumireSolutie;
    private double cantitateSolutie;

    public RetetaMedicament(){

    }

    public RetetaMedicament(String denumireMedicament, String denumireSolutie, double cantitateSolutie) {
        if(denumireMedicament.length()<2 ||denumireMedicament.trim().isEmpty())
        {
            throw new IllegalArgumentException("Denumire Medicament invalida!");
        }
        if(denumireSolutie.length()<2 ||denumireSolutie.trim().isEmpty())
        {
            throw new IllegalArgumentException("Denumire Medicament invalida!");
        }
        if(cantitateSolutie<0 ||cantitateSolutie>1000)
        {
            throw new IllegalArgumentException("Doza invalida!");
        }
        this.denumireMedicament = denumireMedicament;
        this.denumireSolutie = denumireSolutie;
        this.cantitateSolutie = cantitateSolutie;
    }


    @Override
    public RetetaMedicament copiaza() {
        RetetaMedicament copie=new RetetaMedicament();
        copie.denumireMedicament=this.denumireMedicament;
        copie.denumireSolutie=this.denumireSolutie;
        copie.cantitateSolutie=this.cantitateSolutie;
        return copie;
    }

    public void afisareDescriere()
    {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RetetaMedicament{");
        sb.append("denumireMedicament='").append(denumireMedicament).append('\'');
        sb.append(", denumireSolutie='").append(denumireSolutie).append('\'');
        sb.append(", cantitateSolutie=").append(cantitateSolutie);
        sb.append('}');
        return sb.toString();
    }
}
