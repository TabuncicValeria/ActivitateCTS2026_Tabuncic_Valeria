package ro.ase.cts.builder_V1;

public class RezervareBuilder implements RezervareBuilderAbstract{

    private Rezervare rezervare;

    public RezervareBuilder(String numeClient)
    {
        rezervare=new Rezervare(numeClient,false,false,false,false,"");
    }

    @Override
    public Rezervare build() {
        return rezervare;
    }

    public RezervareBuilder setAsezareLaGeam(boolean asezareLaGeam)
    {
        this.rezervare.setAsezareLaGeam(asezareLaGeam);
        return this;
    }
    public RezervareBuilder setScauneErgonomice(boolean scauneErgonomice) {
        this.rezervare.setScauneErgonomice(scauneErgonomice);
        return this;
    }

    public RezervareBuilder setDecorareMasa(boolean decorareMasa) {
        this.rezervare.setDecorareMasa(decorareMasa);
        return this;
    }

    public RezervareBuilder setMuzicaAmbientalaPersonalizata(boolean muzicaAmbientalaPersonalizata) {
        this.rezervare.setMuzicaAmbientalaPersonalizata(muzicaAmbientalaPersonalizata);
        return this;
    }

    public RezervareBuilder setGenMuzica(String genMuzica) {
        this.rezervare.setGenMuzica(genMuzica);
        this.rezervare.setMuzicaAmbientalaPersonalizata(true);
        return this;
    }

}
