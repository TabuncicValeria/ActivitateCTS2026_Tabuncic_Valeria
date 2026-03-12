package ro.ase.cts.factory;

import ro.ase.cts.vehicule.Autobuz;
import ro.ase.cts.vehicule.MijlocTransport;
import ro.ase.cts.vehicule.Tramvai;
import ro.ase.cts.vehicule.Troleibuz;

public class MijlocTransportFcatory {

    public MijlocTransport getMijlocTransport(String marca, int linie, MijlocTransportType tip){

        if(tip==MijlocTransportType.AUTOBUZ)
        {
            return new Autobuz(marca, linie);
        }
        if(tip==MijlocTransportType.TRAMVAI)
        {
            return new Tramvai(marca, linie);
        }
        if(tip==MijlocTransportType.TROLEIBUZ)
        {
            return new Troleibuz(marca, linie);
        }

        return null;

    }
}
