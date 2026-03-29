package ro.ase.cts.builder_v2;

import ro.ase.cts.builder_v1.IBuilder;
import ro.ase.cts.builder_v1.Rezervare;

public class RezervareBuilderV2 implements IBuilder {
    private String numeClient;
    private String telefon;

    private boolean asezareLaGeam;
    private boolean scauneErgonomice;
    private boolean decorareMasa;
    private boolean muzicaAmbientalaPersonalizata;
    private String genMuzica;

    public RezervareBuilderV2(String numeClient, String telefon) {
        this.numeClient = numeClient;
        this.telefon = telefon;
        this.asezareLaGeam=false;
        this.scauneErgonomice=false;
        this.decorareMasa=false;
        this.muzicaAmbientalaPersonalizata=false;
        this.genMuzica="Fara preferinta";
    }

    public RezervareBuilderV2 setAsezareLaGeam(boolean asezareLaGeam) {
        this.asezareLaGeam = asezareLaGeam;
        return this;
    }

    public RezervareBuilderV2 setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
        return this;
    }

    public RezervareBuilderV2 setDecorareMasa(boolean decorareMasa) {
        this.decorareMasa = decorareMasa;
        return this;
    }

    public RezervareBuilderV2 setMuzicaAmbientalaPersonalizata(boolean muzicaAmbientalaPersonalizata) {
        this.muzicaAmbientalaPersonalizata = muzicaAmbientalaPersonalizata;
        return this;
    }

    public RezervareBuilderV2 setScauneErgonomice(boolean scauneErgonomice) {
        this.scauneErgonomice = scauneErgonomice;
        return this;
    }

    @Override
    public Rezervare build() {
        return new Rezervare(this.numeClient,this.telefon,
                this.asezareLaGeam,this.scauneErgonomice,this.decorareMasa,
                this.muzicaAmbientalaPersonalizata,this.genMuzica);
    }
}
