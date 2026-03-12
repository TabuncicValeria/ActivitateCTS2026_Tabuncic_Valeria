package ro.ase.cts.main;

import ro.ase.cts.factory.MijlocTransportFcatory;
import ro.ase.cts.factory.MijlocTransportType;
import ro.ase.cts.vehicule.MijlocTransport;

public class Main {

    public static void afisareMijlocTransport(MijlocTransport mijlocTransport)
    {
        mijlocTransport.afisareDescriere();
    }

    public static void main(String[] args) throws Exception
    {

        MijlocTransportFcatory factory=new MijlocTransportFcatory();
        MijlocTransport autobuz=factory.getMijlocTransport("Mercedes",432, MijlocTransportType.AUTOBUZ);
        MijlocTransport tramvai=factory.getMijlocTransport("Astra",1, MijlocTransportType.TRAMVAI);
        MijlocTransport troleibuz=factory.getMijlocTransport("BMW",97, MijlocTransportType.AUTOBUZ);

        afisareMijlocTransport(autobuz);
        afisareMijlocTransport(tramvai);
        afisareMijlocTransport(troleibuz);
    }
}