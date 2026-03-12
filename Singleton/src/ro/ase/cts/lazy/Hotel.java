package ro.ase.cts.lazy;

public class Hotel {
    private String denumireHotel;
    private int numarCamere;
    private int numarCamereInchiriate;
    private int numarAngajati;

    public void afisareInchiriereCamera() {
        if (numarCamereInchiriate == numarCamere)
        {
            System.out.println("Nu mai exista camere disponibile spre inchiriere!");
        }
        else
        {
            System.out.println("Camera a fost inchiriata cu succes!");
            numarCamereInchiriate++;
        }
    }

    public void afisareDescriere() {
        StringBuilder sb = new StringBuilder("Hotel{");
        sb.append("denumireHotel='").append(denumireHotel).append('\'');
        sb.append(", numarAngajati=").append(numarAngajati);
        sb.append("numarCamereInchiriate= ").append(numarCamereInchiriate);
        sb.append(", numarCamere=").append(numarCamere);
        sb.append('}');
        System.out.println(sb.toString());
    }

    private static Hotel instanta=null;

    public Hotel(String denumireHotel, int numarAngajati, int numarCamere) {
        this.denumireHotel = denumireHotel;
        this.numarAngajati = numarAngajati;
        this.numarCamereInchiriate=0;
        this.numarCamere = numarCamere;
    }

    public static synchronized Hotel getInstance(String denumire, int nrAngajati,int nrCamere)
    {
        if(instanta==null)
        {
            instanta=new Hotel(denumire,nrAngajati,nrCamere);
        }
        return instanta;
    }





}
