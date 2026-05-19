package ro.ase.cts.clase;

public class Rezervare {
    private int numarMasa;
    private int numarPersoane;
    private String oraRezervare;

    public Rezervare(int numarMasa, int numarPersoane, String oraRezervare) {
        this.numarMasa = numarMasa;
        this.numarPersoane = numarPersoane;
        this.oraRezervare = oraRezervare;
    }

    public int getNumarMasa() {
        return numarMasa;
    }

    public int getNumarPersoane() {
        return numarPersoane;
    }

    public String getOraRezervare() {
        return oraRezervare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numarMasa=").append(numarMasa);
        sb.append(", numarPersoane=").append(numarPersoane);
        sb.append(", oraRezervare='").append(oraRezervare).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
