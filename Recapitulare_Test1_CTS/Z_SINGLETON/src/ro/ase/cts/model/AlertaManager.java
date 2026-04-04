package ro.ase.cts.model;

import java.util.ArrayList;
import java.util.List;

public class AlertaManager implements IAlertManager{
    private String numeCentruMonitorizare;
    private List<AlertaServer> listaAlerte;

    private static AlertaManager instanta=null;

    private AlertaManager(String numeCentruMonitorizare) {
        this.numeCentruMonitorizare = numeCentruMonitorizare;
        this.listaAlerte = new ArrayList<>();
    }

    public static synchronized AlertaManager getInstanta(String numeCentruMonitorizare)
    {
        if(instanta==null)
        {
            instanta=new AlertaManager(numeCentruMonitorizare);
        }
        return instanta;
    }

    public String getNumeCentruMonitorizare() {
        return numeCentruMonitorizare;
    }

    @Override
    public void adaugaAlerta(String serverId, String mesaj, int severitate) {
        if(mesaj==null||mesaj.trim().isEmpty())
        {
            System.out.println("Alerta pentru serverul "+serverId+" nu a fost salvata!");
            return;
        }
        AlertaServer alertaNoua=new AlertaServer(serverId,mesaj,severitate);
        this.listaAlerte.add(alertaNoua);
        System.out.println("A fost inregistrata o alerta noua pentru serverul " +
                             serverId + " cu severitate " + severitate + ".");
    }

    @Override
    public void afiseazaUltimeleAlerte() {
        if(listaAlerte.isEmpty())
        {
            System.out.println("Nu exista alerte!");
            return;
        }
        int contor=0;

        for(int i=listaAlerte.size()-1;i>=0 && contor<5;i--)
        {
            System.out.println(listaAlerte.get(i));
            contor++;
        }
    }

    @Override
    public int getNumarAlerteCritice() {
        int nrAlerteCritice=0;
        for(AlertaServer alerta:listaAlerte)
        {
            if(alerta.getSeveritate()>=8)
            {
                nrAlerteCritice++;
            }
        }
        return nrAlerteCritice;
    }
}
