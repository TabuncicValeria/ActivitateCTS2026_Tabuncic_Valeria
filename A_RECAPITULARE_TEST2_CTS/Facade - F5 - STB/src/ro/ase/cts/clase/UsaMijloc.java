package ro.ase.cts.clase;

public class UsaMijloc implements IDeschidereUsa {

    @Override
    public void deschideLaSolicitare() {
        System.out.println("Usa din mijloc a fost deschisa la solicitatea pasagerului");
    }

    @Override
    public void deschideFortat() {
        System.out.println("Usa din mijloc a fost deschisa fortat.");
    }
}

