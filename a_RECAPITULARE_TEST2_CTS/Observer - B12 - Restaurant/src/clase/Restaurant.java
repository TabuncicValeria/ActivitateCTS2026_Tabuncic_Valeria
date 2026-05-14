package clase;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements IRestaurant{
    private String denumire;
    private List<Client> listaClienti=new ArrayList<>();

    public Restaurant(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void trimiteMesaj(String mesaj) {
        for(Client client:listaClienti)
        {
            client.primesteNotificare(mesaj +" de la restaurantul "+this.denumire);
        }
    }

    @Override
    public void aboneazaClient(Client client) {
        listaClienti.add(client);
    }

    @Override
    public void dezaboneazaClient(Client client) {
        listaClienti.remove(client);
    }
    public void notificaOfertaPret(){
        trimiteMesaj("A aparut o noua oferta de pret!");
    }
    public void notificaMeniuNou(){
        trimiteMesaj("A fost introdus un nou meniu!");
    }
}
