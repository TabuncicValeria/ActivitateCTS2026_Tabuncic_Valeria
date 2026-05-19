package ro.ase.cts.decorator;

import ro.ase.cts.clase.IRezultatPrintat;
import ro.ase.cts.clase.Rezultat;

public class RezultatOnline extends RezultatDecorator{
    private String email;
    public RezultatOnline(IRezultatPrintat rezultatPrintat, String email) {
        super(rezultatPrintat);
        this.email=email;
    }
    @Override
    public void expediazaRezultatOnline() {
        Rezultat rezultat=(Rezultat) rezultatPrintat;
        System.out.println("Rezultatele analizelor pentru pacientul "+rezultat.getNumePacient()+" colectate de medicul specialist "+rezultat.getNumeMedic()+" la data de "+rezultat.getData()
                +" au fost expediate si online la adresa "+this.email);
    }

    @Override
    public void printeazaRezultat() {
        super.printeazaRezultat();
        expediazaRezultatOnline();
    }
}
