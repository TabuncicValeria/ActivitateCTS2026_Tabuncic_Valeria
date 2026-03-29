package ro.ase.cts.builder_v1;

public class RezervareBuilderV1 implements IBuilder{

    private Rezervare rezervare;

    public RezervareBuilderV1(String numeClient,String telefon)
    {
        this.rezervare=new Rezervare(numeClient,telefon,false,false,false,false,"Fara preferinte");
    }

    @Override
    public Rezervare build() {
        return this.rezervare;
    }

    public RezervareBuilderV1 setAsezareLaGeam(boolean asezareLaGeam) {
        rezervare.setAsezareLaGeam(asezareLaGeam);
        return this;
    }

    public  RezervareBuilderV1 setDecorareMasa(boolean decorareMasa) {
        rezervare.setDecorareMasa(decorareMasa);
        return this;
    }

    public  RezervareBuilderV1 setGenMuzica(String genMuzica) {
        rezervare.setGenMuzica(genMuzica);
        return this;
    }

    public  RezervareBuilderV1 setMuzicaAmbientalaPersonalizata(boolean muzicaAmbientalaPersonalizata) {
        rezervare.setMuzicaAmbientalaPersonalizata(muzicaAmbientalaPersonalizata);
        return this;
    }

    public  RezervareBuilderV1 setScauneErgonomice(boolean scauneErgonomice) {
        rezervare.setScauneErgonomice(scauneErgonomice);
        return this;
    }
}
