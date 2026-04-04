package ro.ase.cts.model;

public class AbonamentPremium extends AbonamentAbstract{
    public AbonamentPremium(String numePlan, int numarDispozitive, double pretBaza) {
        super(numePlan, numarDispozitive, pretBaza);
    }

    @Override
    public void activeaza() {
        System.out.println("Abonamentul Premium a fost activat. Ai acces complet si download offline.");
    }



    @Override
    public double calculeazaPretLunar() {
        return pretBaza;
    }

    @Override
    public boolean permiteDownloadOffline() {
        return true;
    }
}
