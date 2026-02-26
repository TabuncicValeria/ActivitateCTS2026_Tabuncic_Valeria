package ro.ase.cts.hotel;

public class ReducereProcentuala implements Reducere{
    private final double procent;
    public ReducereProcentuala(double procent)
    {
        this.procent=procent;
    }

    @Override
    public double aplicaReducere(double total) {
        return total-(total*procent/100);
    }
}
