package ro.ase.cts.clase;

public class UsiAutobuz {
    private IDeschidereUsa usaFata;
    private IDeschidereUsa usaMijloc;
    private IDeschidereUsa usaSpate;

    public UsiAutobuz(UsaFata usaFata, UsaMijloc usaMijloc, UsaSpate usaSpate) {
        this.usaFata = usaFata;
        this.usaMijloc = usaMijloc;
        this.usaSpate = usaSpate;
    }

    public void deschideLaSolicitateToateUsile()
    {
        usaFata.deschideLaSolicitare();
        usaMijloc.deschideLaSolicitare();
        usaSpate.deschideLaSolicitare();
    }
    public void deschideFortatToateUsile()
    {
        usaFata.deschideFortat();
        usaMijloc.deschideFortat();
        usaSpate.deschideFortat();
    }
}
