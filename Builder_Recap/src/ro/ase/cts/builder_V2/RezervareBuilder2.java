package ro.ase.cts.builder_V2;

import ro.ase.cts.builder_V1.Rezervare;
import ro.ase.cts.builder_V1.RezervareBuilder;

public class RezervareBuilder2 implements RezervareBuilderAbstract2{

    private String numeClient;
    private boolean asezareLaGeam;
    private boolean scauneErgonomice;
    private boolean decorareMasa;
    private boolean muzicaAmbientalaPersonalizata;
    private String genMuzica;

    public RezervareBuilder2(String numeClient) {
        this.numeClient = numeClient;
        this.asezareLaGeam =false;
        this.scauneErgonomice = false;
        this.decorareMasa = false;
        this.muzicaAmbientalaPersonalizata = false;
        this.genMuzica = "";
    }
    @Override
    public Rezervare2 build() {
        return new Rezervare2(numeClient,asezareLaGeam,scauneErgonomice,decorareMasa,muzicaAmbientalaPersonalizata,genMuzica);
    }
    public RezervareBuilder2 setAsezareLaGeam(boolean asezareLaGeam)
    {
        this.asezareLaGeam = asezareLaGeam;
        return this;
    }
    public RezervareBuilder2 setScauneErgonomice(boolean scauneErgonomice) {
        this.scauneErgonomice=scauneErgonomice;
        return this;
    }

    public RezervareBuilder2 setDecorareMasa(boolean decorareMasa) {
        this.decorareMasa = decorareMasa;
        return this;
    }

    public RezervareBuilder2 setMuzicaAmbientalaPersonalizata(boolean muzicaAmbientalaPersonalizata) {
        this.muzicaAmbientalaPersonalizata = muzicaAmbientalaPersonalizata;
        return this;
    }

    public RezervareBuilder2 setGenMuzica(String genMuzica) {
        this.genMuzica=genMuzica;
        this.muzicaAmbientalaPersonalizata=true;
        return this;
    }

}
