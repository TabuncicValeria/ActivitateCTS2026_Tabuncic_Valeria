package ro.ase.cts.clase;

public class MedicamentFarmacie implements IMedicamentFarmacie {
    private String denumireMedicament;

    public MedicamentFarmacie(String denumireMedicament) {
        this.denumireMedicament = denumireMedicament;
    }

    public void cumparaMedicament()
    {
        System.out.println(" Clientul a cumparat medicamentul "+this.denumireMedicament+".");
    }
}
