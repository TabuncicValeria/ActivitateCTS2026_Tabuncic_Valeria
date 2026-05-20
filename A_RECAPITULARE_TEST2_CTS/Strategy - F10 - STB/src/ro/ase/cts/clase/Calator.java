package ro.ase.cts.clase;

public class Calator {
    private ModPlata modPlata;
    private String numeCalator;
    private String mijlocTransport;

    public Calator(ModPlata modPlata, String numeCalator, String mijlocTransport) {
        this.modPlata = modPlata;
        this.numeCalator = numeCalator;
        this.mijlocTransport = mijlocTransport;
    }

    public Calator(String numeCalator, String mijlocTransport) {
        this.modPlata=new PlataCardBancar();// modalitate implicita de plata
        this.numeCalator = numeCalator;
        this.mijlocTransport = mijlocTransport;
    }

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }

    public void plateste()
    {
        modPlata.realizeazaPlata();
    }
}

