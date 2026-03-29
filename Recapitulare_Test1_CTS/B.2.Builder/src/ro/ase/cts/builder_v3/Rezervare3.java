package ro.ase.cts.builder_v3;


public class Rezervare3 {
    private String numeClient;
    private String telefon;

    private boolean asezareLaGeam;
    private boolean scauneErgonomice;
    private boolean decorareMasa;
    private boolean muzicaAmbientalaPersonalizata;
    private String genMuzica;

    private Rezervare3(RezervareBuilderV3 builder) {
        this.numeClient = builder.numeClient;
        this.telefon = builder.telefon;
        this.asezareLaGeam = builder.asezareLaGeam;
        this.scauneErgonomice = builder.scauneErgonomice;
        this.decorareMasa = builder.decorareMasa;
        this.muzicaAmbientalaPersonalizata = builder.muzicaAmbientalaPersonalizata;
        this.genMuzica = builder.genMuzica;
    }

    public static RezervareBuilderV3 builder(String numeClient,String telefon)
    {
        return new RezervareBuilderV3(numeClient,telefon);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", telefon='").append(telefon).append('\'');
        sb.append(", asezareLaGeam=").append(asezareLaGeam);
        sb.append(", scauneErgonomice=").append(scauneErgonomice);
        sb.append(", decorareMasa=").append(decorareMasa);
        sb.append(", muzicaAmbientalaPersonalizata=").append(muzicaAmbientalaPersonalizata);
        sb.append(", genMuzica='").append(genMuzica).append('\'');
        sb.append('}');
        return sb.toString();
    }

    //inner static builder
    public static class RezervareBuilderV3{
        private String numeClient;
        private String telefon;

        private boolean asezareLaGeam;
        private boolean scauneErgonomice;
        private boolean decorareMasa;
        private boolean muzicaAmbientalaPersonalizata;
        private String genMuzica;

        public RezervareBuilderV3(String numeClient,String telefon) {
            this.numeClient =numeClient;
            this.telefon =telefon;
            this.asezareLaGeam = false;
            this.scauneErgonomice =false;
            this.decorareMasa = false;
            this.muzicaAmbientalaPersonalizata = false;
            this.genMuzica = "-";
        }
        public RezervareBuilderV3 setAsezareLaGeam(boolean asezareLaGeam) {
            this.asezareLaGeam = asezareLaGeam;
            return this;
        }

        public RezervareBuilderV3 setGenMuzica(String genMuzica) {
            this.genMuzica = genMuzica;
            return this;
        }

        public RezervareBuilderV3 setDecorareMasa(boolean decorareMasa) {
            this.decorareMasa = decorareMasa;
            return this;
        }

        public RezervareBuilderV3 setMuzicaAmbientalaPersonalizata(boolean muzicaAmbientalaPersonalizata) {
            this.muzicaAmbientalaPersonalizata = muzicaAmbientalaPersonalizata;
            return this;
        }

        public RezervareBuilderV3 setScauneErgonomice(boolean scauneErgonomice) {
            this.scauneErgonomice = scauneErgonomice;
            return this;
        }

        public Rezervare3 build(){
            return new Rezervare3(this);
        }

    }
}
