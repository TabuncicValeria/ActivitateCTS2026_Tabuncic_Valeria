package ro.ase.cts.model;

public class AbonamentFree extends AbonamentAbstract {

    public AbonamentFree(String numePlan, int numarDispozitive, double pretBaza) {
        super(numePlan, numarDispozitive, pretBaza);
    }

    @Override
    public void activeaza() {
        System.out.println("Abonamentul free a fost activat la costul de doar 0 lei!");
    }



    @Override
    public double calculeazaPretLunar() {
        return 0;
    }

    @Override
    public boolean permiteDownloadOffline() {
        return false;
    }
}
