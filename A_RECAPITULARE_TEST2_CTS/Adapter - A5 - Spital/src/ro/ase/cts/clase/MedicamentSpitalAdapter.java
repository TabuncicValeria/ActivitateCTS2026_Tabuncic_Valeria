package ro.ase.cts.clase;

public class MedicamentSpitalAdapter extends MedicamentSpital implements IMedicamentFarmacie{


    public MedicamentSpitalAdapter(String numeMedicament, String pret, boolean areReteta) {
        super(numeMedicament, pret, areReteta);
    }

    @Override
    public void cumparaMedicament() {
        super.achizitioneazaMedicament();
    }
}
