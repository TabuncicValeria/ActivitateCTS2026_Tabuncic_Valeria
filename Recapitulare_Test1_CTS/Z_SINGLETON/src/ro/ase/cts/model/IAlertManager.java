package ro.ase.cts.model;

public interface IAlertManager {
    void adaugaAlerta(String serverId, String mesaj, int severitate);
    void afiseazaUltimeleAlerte();
    int getNumarAlerteCritice();
}
