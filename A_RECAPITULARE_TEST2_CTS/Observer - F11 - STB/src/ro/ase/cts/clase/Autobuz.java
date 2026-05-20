package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Autobuz implements IAutobuz{

    private String nrAutobuz;
    private List<ICalator> listaCalatori=new ArrayList<>();

    public Autobuz (String nrAutobuz)
    {
        this.nrAutobuz=nrAutobuz;
    }

    @Override
    public void trimiteNotificare(String mesaj) {
        for(ICalator calator: listaCalatori)
        {
            calator.receptioneazaNotificare(mesaj+ ". Mesajul este valabil pentru ruta: "+this.nrAutobuz+".");
        }
    }

    @Override
    public void aboneazaCalator(ICalator calator) {
        listaCalatori.add(calator);
    }

    @Override
    public void dezaboneazaCalator(ICalator calator) {
        listaCalatori.remove(calator);
    }

    public void notificaPornireAutbuz()
    {
        trimiteNotificare("Autobuzul a pornit de la capatul liniei. Va puteti apropia de statie! ");
    }
}
