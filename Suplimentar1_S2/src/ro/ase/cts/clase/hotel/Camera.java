package ro.ase.cts.hotel;

public class Camera {
    private final int numar;
    private int capacitate;
    private double pretPeNoapte;

    public Camera(int numar, int capacitate, double pretPeNoapte) {
        if(numar<=0 ||capacitate<=0 ||pretPeNoapte<0)
            throw new IllegalArgumentException("Date Camera Invalide");
        this.numar = numar;
        this.capacitate = capacitate;
        this.pretPeNoapte = pretPeNoapte;
    }

    public int getNumar() {
        return numar;
    }

    public int getCapacitate() {
        return capacitate;
    }

    public void setCapacitate(int capacitate) {
        if(capacitate<=0 ||capacitate>=10) throw new IllegalArgumentException("Capacitate Invalida");
        this.capacitate = capacitate;
    }

    public double getPretPeNoapte() {
        return pretPeNoapte;
    }

    public void setPretPeNoapte(double pretPeNoapte) {
        if (pretPeNoapte < 0) throw new IllegalArgumentException("Pret invalid");
        this.pretPeNoapte = pretPeNoapte;
    }

    @Override
    public String toString() {
        return "Camera cu nr." +numar+" este preconizata pentru "+capacitate+" persoane si e la "+pretPeNoapte+" lei.";
    }

}
