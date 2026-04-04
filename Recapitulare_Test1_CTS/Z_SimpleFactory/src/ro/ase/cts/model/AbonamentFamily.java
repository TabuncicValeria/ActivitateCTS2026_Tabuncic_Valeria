package ro.ase.cts.model;

public class AbonamentFamily extends AbonamentAbstract{
    public AbonamentFamily(String numePlan, int numarDispozitive, double pretBaza) {
        super(numePlan, numarDispozitive, pretBaza);
    }

    @Override
    public void activeaza() {
        System.out.println("Abonamentul Family a fost activat!");
    }



    @Override
    public double calculeazaPretLunar() {
        return pretBaza + pretBaza * 0.20;
    }

    @Override
    public boolean permiteDownloadOffline() {
        return true;
    }
}
