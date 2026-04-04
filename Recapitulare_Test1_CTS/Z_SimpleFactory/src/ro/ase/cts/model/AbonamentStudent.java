package ro.ase.cts.model;

public class AbonamentStudent extends AbonamentAbstract {
    public AbonamentStudent(String numePlan, int numarDispozitive, double pretBaza) {
        super(numePlan, numarDispozitive, pretBaza);
    }

    @Override
    public void activeaza() {
        System.out.println("Abonamentul Student a fost activat cu o reducere de 50%!");
    }



    @Override
    public double calculeazaPretLunar() {
        return pretBaza/2;
    }

    @Override
    public boolean permiteDownloadOffline() {
        return true;
    }
}
