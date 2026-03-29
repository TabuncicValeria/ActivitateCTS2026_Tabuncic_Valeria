package ro.ase.cts.clase;

public class MijlocTransport implements MijlocTransportPrototype{

    private String denumire;
    private String marca;
    private String nrInmatriculare;
    private int vechime;

    public MijlocTransport(){}

    public MijlocTransport(String denumire, String marca, String nrInmatriculare, int vechime) {
        this.denumire = denumire;
        this.marca = marca;
        this.nrInmatriculare = nrInmatriculare;
        this.vechime = vechime;
    }

    @Override
    public MijlocTransport copiaza() {
        MijlocTransport copie=new MijlocTransport();
        copie.denumire=this.denumire;
        copie.marca=this.marca;
        copie.nrInmatriculare=this.nrInmatriculare;
        copie.vechime=this.vechime;
        return copie;
    }

    public void afisareDescriere()
    {
        System.out.println(this.toString());
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MijlocTransport{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", marca='").append(marca).append('\'');
        sb.append(", nrInmatriculare='").append(nrInmatriculare).append('\'');
        sb.append(", vechime=").append(vechime);
        sb.append('}');
        return sb.toString();
    }
}
