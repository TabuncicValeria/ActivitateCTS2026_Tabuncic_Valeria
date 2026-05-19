package ro.ase.cts.clase;

import java.util.HashMap;
import java.util.Map;

public class PacientFactory {
    private Map<String, IPacient> pacienti=new HashMap<>();

    public IPacient getPacient(String nume, String nrTelefon, String adresa)
    {
        if(pacienti.containsKey(nrTelefon)){
            return pacienti.get(nrTelefon);
        }else {
            IPacient pacient=new Pacient(nume,nrTelefon,adresa);
            pacienti.put(nrTelefon, pacient);
            return pacient;
        }
    }

    public int getNumarPacienti()
    {
        return pacienti.size();
    }
}
