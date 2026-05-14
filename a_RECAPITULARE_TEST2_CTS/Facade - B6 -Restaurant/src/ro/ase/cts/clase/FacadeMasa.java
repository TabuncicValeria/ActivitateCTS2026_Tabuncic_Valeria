package ro.ase.cts.clase;

public class FacadeMasa {
    private SalaRestaurant salaRestaurant;
    private MasaDebarasata debarasareMasa;
    private ServeteleMasa serveteleNoi;

    public FacadeMasa(SalaRestaurant salaRestaurant, MasaDebarasata debarasareMasa, ServeteleMasa serveteleNoi) {
        this.salaRestaurant = salaRestaurant;
        this.debarasareMasa = debarasareMasa;
        this.serveteleNoi = serveteleNoi;
    }

    public void asezareClientiLaMasa(int numarPersoane)
    {
        Masa masaLibera=salaRestaurant.getMasaLibera(numarPersoane);
        if(masaLibera!=null)
        {
            if(debarasareMasa.esteDebarasata(masaLibera))
            {
                if(serveteleNoi.areServeteleNoi(masaLibera))
                {
                    System.out.println("Clientii au fost asezati la masa "+masaLibera.getNumarMasa()+", cu capacitatea de "+masaLibera.getCapacitate()+" persoane.");
                    salaRestaurant.ocupaMasa(masaLibera);
                }
                else
                {
                    System.out.println("Masa "+masaLibera.getNumarMasa()+" este libera, dar nu are servetele noi!");
                }
            }
            else
            {
                System.out.println("Masa "+masaLibera.getNumarMasa()+" este libera, dar nu a fost debarasata.");
            }
        }
        else
        {
            System.out.println("Nu exista o masa libera!");
        }
    }
}
