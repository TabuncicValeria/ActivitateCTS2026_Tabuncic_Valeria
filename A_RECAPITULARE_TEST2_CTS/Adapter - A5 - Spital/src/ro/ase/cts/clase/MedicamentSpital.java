package ro.ase.cts.clase;

public class MedicamentSpital {
    private String numeMedicament;
    private String pret;
    private boolean areReteta;

    public MedicamentSpital(String numeMedicament, String pret, boolean areReteta) {
        this.numeMedicament = numeMedicament;
        this.pret = pret;
        this.areReteta=areReteta;
    }

    public boolean prezintaReteta(){
        return this.areReteta;
    }

    public void achizitioneazaMedicament()
    {
        if(prezintaReteta())
        {
            System.out.println("Medicamentul "+this.numeMedicament+" este achizitonat cu reteta la pretul de "+this.pret+".");
        }
        else {
            System.out.println("Medicamentul "+this.numeMedicament+" este achizitonat fara reteta la pretul de "+this.pret+".");
        }

    }
}
