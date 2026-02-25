package ro.ase.cts.hotel;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private final String nume;
    private final List<Camera> camere=new ArrayList<>();
    private final List<Rezervare> rezervari=new ArrayList<>();

    public Hotel(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void adaugaCamera(Camera camera)
    {
        if(camera==null) throw new IllegalArgumentException("Camera nu a fost selectata");
        camere.add(camera);
    }

    public void adaugaRezervare(Rezervare rezervare)
    {
        if(rezervare==null) throw new IllegalArgumentException("Rezervare Incorecta");
        rezervari.add(rezervare);
    }

    public List<Camera> getCamere() {
        return camere;
    }

    public List<Rezervare> getRezervari() {
        return rezervari;
    }

    public void afiseazaDetalii(){
        System.out.println("Hotel: "+nume);
        System.out.println("Camere: ");
        for(Camera c:camere){
            System.out.println(" "+c);
        }
        System.out.println("Rezervari: ");
        for(Rezervare r:rezervari)
        {
            System.out.println(" "+r);
            System.out.println();
        }
    }
}
