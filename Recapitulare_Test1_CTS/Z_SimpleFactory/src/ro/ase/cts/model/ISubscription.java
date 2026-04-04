package ro.ase.cts.model;

public interface ISubscription {
    void activeaza();
    String getDescriere();
    double calculeazaPretLunar();
    boolean permiteDownloadOffline();
}
