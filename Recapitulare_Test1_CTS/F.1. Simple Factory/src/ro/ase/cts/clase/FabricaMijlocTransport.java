package ro.ase.cts.clase;

public class FabricaMijlocTransport {
    public MijlocTransport getMijlocTransport(TipMijlocTransport tip, String denumire, String marca,String nrInmatriculare)
    {
        switch(tip){
            case AUTOBUZ:
                return new Autobuz(denumire,marca,nrInmatriculare);
            case TRAMVAI:
                return new Tramvai(denumire,marca,nrInmatriculare);
            case TROLEIBUZ:
                return new Troleibuz(denumire,marca,nrInmatriculare);
            default:
                throw new IllegalArgumentException("Nu exista acest mijloc de tranport!");
        }
    }
}
