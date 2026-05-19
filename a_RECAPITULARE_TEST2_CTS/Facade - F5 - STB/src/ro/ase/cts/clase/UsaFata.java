package ro.ase.cts.clase;

public class UsaFata implements IDeschidereUsa {

    @Override
    public void deschideLaSolicitare() {
        System.out.println("Usa din fata a fost deschisa la solicitatea pasagerului");
    }

    @Override
    public void deschideFortat() {
        System.out.println("Usa din fata a fost deschisa fortat.");
    }
}
