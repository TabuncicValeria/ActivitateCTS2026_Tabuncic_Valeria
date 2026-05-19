package ro.ase.cts.decorator;

import ro.ase.cts.clase.IRezultatPrintat;

public abstract class RezultatDecorator implements IRezultatPrintat {
    protected IRezultatPrintat rezultatPrintat;

    public RezultatDecorator(IRezultatPrintat rezultatPrintat) {
        this.rezultatPrintat = rezultatPrintat;
    }

    @Override
    public void printeazaRezultat() {
        rezultatPrintat.printeazaRezultat();
    }
    public abstract void expediazaRezultatOnline();
}
