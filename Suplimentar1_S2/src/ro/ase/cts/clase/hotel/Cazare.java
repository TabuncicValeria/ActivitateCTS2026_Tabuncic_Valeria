package ro.ase.cts.hotel;

import java.time.LocalDate;
import java.time.Period;

public class Cazare extends ServiciuHotel{

    private final Camera camera;
    private final LocalDate checkIn;
    private final LocalDate checkOut;

    public Cazare(Camera camera, LocalDate checkIn, LocalDate checkOut) {
        super("Cazare", camera.getPretPeNoapte());
        this.camera=camera;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public double calculeazaCost() {
        int nopti= Period.between(checkIn,checkOut).getDays();
        return nopti*pretBaza;
    }

    @Override
    public String toString() {
        return "Cazare{" +
                "camera=" + camera +
                ", checkIn=" + checkIn +
                ", checkOut=" + checkOut +
                ", cost=" + calculeazaCost() +
                '}';
    }
}
