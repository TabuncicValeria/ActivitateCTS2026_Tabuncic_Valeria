package ro.ase.cts.hotel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Rezervare {
    private static final Random random=new Random();

    private final String id;
    private final Client client;// rel de tip has-a
    private final Camera camera;
    private final LocalDate checkIn;
    private final LocalDate checkOut;
    private StatusRezervare status;
    private Reducere reducere;

    private final List<ServiciuHotel> servicii=new ArrayList<>();
    public Rezervare(String id, Client client, Camera camera, LocalDate checkIn, LocalDate checkOut) {
        this.id = id;
        this.client = client;
        this.camera = camera;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.status = StatusRezervare.Creata;
    }

    //construim un constructor cu generarea random a datelor
    //pt check-in o data random
    //pt check-out = data check-in +"n" zile random generat


    public Rezervare(String id, Client client, Camera camera) {
        this.id = id;
        this.client = client;
        this.camera = camera;
        int zilePanaLaCheckIn = random.nextInt(30);
        this.checkIn = LocalDate.now().plusDays(zilePanaLaCheckIn);
        int durataSejur=random.nextInt(7)+1;
        this.checkOut=checkIn.plusDays(durataSejur);
        this.status = StatusRezervare.Creata;
    }

    public String getId() {
        return id;
    }

    public Client getClient() {
        return client;
    }

    public Camera getCamera() {
        return camera;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public StatusRezervare getStatus() {
        return status;
    }

    public void confirma(){
        if(status==StatusRezervare.Anulata)
        {
            throw new IllegalArgumentException("Nu se poate confirma. Rezervarea a fost anulata");
        }
        status=StatusRezervare.Confirmata;
    }

    public void anuleaza(){
        status=StatusRezervare.Anulata;
    }

    public void adaugaServiciu(ServiciuHotel serviciu)
    {
        servicii.add(serviciu);
    }

    public List<ServiciuHotel> getServicii(){
        return servicii;
    }
    public double calculeazaTotalServicii(){
        double total=0;
        for(ServiciuHotel s: servicii)
        {
            total+=s.calculeazaCost();
        }
        return total;
    }

    public void setReducere(Reducere reducere)
    {
        this.reducere=reducere;

    }
    public double calculeazaTotalFinal(){
        double total=calculeazaTotalServicii();
        if(reducere!=null)
        {
            return reducere.aplicaReducere(total);
        }
        return total;
    }
    @Override
    public String toString() {
        return "Rezervarea cu " +
                "id:" + id + ",\n"+
                "client:" + client + ",\n"+
                "camera:" + camera + ",\n"+
                "checkIn:" + checkIn +
                ", checkOut:" + checkOut +
                ", status:" + status+ ",\n"+
                "servicii=" + servicii+ ",\n"+
                "totalServicii=" + calculeazaTotalServicii() +" lei."+ ",\n"+
                "totalFinal=" + calculeazaTotalFinal() + " lei";
    }
}

