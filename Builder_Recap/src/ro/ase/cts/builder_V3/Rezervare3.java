package ro.ase.cts.builder_V3;

import ro.ase.cts.builder_V1.Rezervare;
import ro.ase.cts.builder_V2.RezervareBuilder2;

public class Rezervare3 {
    private String numeClient;
    private boolean asezareLaGeam;
    private boolean scauneErgonomice;
    private boolean decorareMasa;
    private boolean muzicaAmbientalaPersonalizata;
    private String genMuzica;

    private Rezervare3(){

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare3{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", asezareLaGeam=").append(asezareLaGeam);
        sb.append(", scauneErgonomice=").append(scauneErgonomice);
        sb.append(", decorareMasa=").append(decorareMasa);
        sb.append(", muzicaAmbientalaPersonalizata=").append(muzicaAmbientalaPersonalizata);
        sb.append(", genMuzica='").append(genMuzica).append('\'');
        sb.append('}');
        return sb.toString();
    }
    public static class RezervareBuilder3 implements RezervareBuilderAbstract3{
        private String numeClient;
        private boolean asezareLaGeam;
        private boolean scauneErgonomice;
        private boolean decorareMasa;
        private boolean muzicaAmbientalaPersonalizata;
        private String genMuzica;

        public RezervareBuilder3(String numeClient) {
            this.numeClient = numeClient;
            this.asezareLaGeam =false;
            this.scauneErgonomice = false;
            this.decorareMasa = false;
            this.muzicaAmbientalaPersonalizata = false;
            this.genMuzica = "";
        }

        public RezervareBuilder3 setAsezareLaGeam(boolean asezareLaGeam)
        {
            this.asezareLaGeam = asezareLaGeam;
            return this;
        }
        public RezervareBuilder3 setScauneErgonomice(boolean scauneErgonomice) {
            this.scauneErgonomice=scauneErgonomice;
            return this;
        }

        public RezervareBuilder3 setDecorareMasa(boolean decorareMasa) {
            this.decorareMasa = decorareMasa;
            return this;
        }

        public RezervareBuilder3 setMuzicaAmbientalaPersonalizata(boolean muzicaAmbientalaPersonalizata) {
            this.muzicaAmbientalaPersonalizata = muzicaAmbientalaPersonalizata;
            return this;
        }

        public RezervareBuilder3 setGenMuzica(String genMuzica) {
            this.genMuzica=genMuzica;
            this.muzicaAmbientalaPersonalizata=true;
            return this;
        }


        @Override
        public Rezervare3 build() {
            Rezervare3 rezervare=new Rezervare3();
            rezervare.numeClient = this.numeClient;
            rezervare.asezareLaGeam = this.asezareLaGeam;
            rezervare.scauneErgonomice = this.scauneErgonomice;
            rezervare.decorareMasa = this.decorareMasa;
            rezervare.muzicaAmbientalaPersonalizata = this.muzicaAmbientalaPersonalizata;
            rezervare.genMuzica = this.genMuzica;
            return rezervare;

        }
    }
}
