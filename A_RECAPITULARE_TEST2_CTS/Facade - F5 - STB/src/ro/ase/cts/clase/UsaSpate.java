package ro.ase.cts.clase;

public class UsaSpate implements IDeschidereUsa {

    @Override
    public void deschideLaSolicitare() {
        System.out.println("Usa din spate a fost deschisa la solicitatea pasagerului");
    }

    @Override
    public void deschideFortat() {
        System.out.println("Usa din spate a fost deschisa fortat.");
    }
}
