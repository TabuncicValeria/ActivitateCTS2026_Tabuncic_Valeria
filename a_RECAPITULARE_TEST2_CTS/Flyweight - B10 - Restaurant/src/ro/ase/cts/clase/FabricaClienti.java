package ro.ase.cts.clase;

import java.util.HashMap;
import java.util.Map;

public class FabricaClienti {
    /*HashMap-ul - daca obiectul exista deja, este returnat din colectie;
    * daca nu exista, este creat si salvat*/
    private Map<String,IClientRestaurant> clienti=new HashMap<>();
    public IClientRestaurant getClient(String numarTelefon,String nume,String adresaMail)
    {
        if(clienti.containsKey(numarTelefon))
        {
            return clienti.get(numarTelefon);
        }else {
            IClientRestaurant client=new ClientRestaurant(nume,numarTelefon,adresaMail);
            clienti.put(numarTelefon,client);
            return client;
        }
    }
    public int getNumarClienti(){
        return clienti.size();
    }
}
