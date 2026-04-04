package ro.ase.cts.main;

import ro.ase.cts.model.AlertaManager;

public class Main {
    public static void main(String[] args) {

        System.out.println("SINGLETON");
        AlertaManager am1=AlertaManager.getInstanta("Centru Monitorizare Local");
        AlertaManager am2=AlertaManager.getInstanta("Centrul Nr2");
        System.out.println("Instantele sunt identice? "+(am1==am2));

        am1.adaugaAlerta("SRV-01", "Procesor supraincarcat", 7);
        am1.adaugaAlerta("SRV-02", "Procesor supraincarcat", 9);
        am1.afiseazaUltimeleAlerte();
        System.out.println("Au fost inregistrate "+am1.getNumarAlerteCritice()+" alerte critice!");
    }
}