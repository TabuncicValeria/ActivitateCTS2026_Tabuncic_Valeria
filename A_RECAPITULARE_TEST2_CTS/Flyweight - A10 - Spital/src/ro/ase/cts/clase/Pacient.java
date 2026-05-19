package ro.ase.cts.clase;

public class Pacient implements IPacient{
    private String numePacient;
    private String nrTelefon;
    private String adresa;

    public Pacient(String numePacient, String nrTelefon, String adresa) {
        this.numePacient = numePacient;
        this.nrTelefon = nrTelefon;
        this.adresa = adresa;
    }

    public String getAdresa() {
        return adresa;
    }

    public String getNrTelefon() {
        return nrTelefon;
    }

    public String getNumePacient() {
        return numePacient;
    }

    @Override
    public void afiseazaInternare(Salon salon) {
        System.out.println("Pacientul "+this.numePacient+" cu nr de telefon "+this.nrTelefon+" si adresa de domiciliu "+
                this.adresa+" este internat in salonul "+salon.getNrSalon()+", patul "+salon.getNrPat()+" pentru "+salon.getNrZile()+" zile.");

    }
}
