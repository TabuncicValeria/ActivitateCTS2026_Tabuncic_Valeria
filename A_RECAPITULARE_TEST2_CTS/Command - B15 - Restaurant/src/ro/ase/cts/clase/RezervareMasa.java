package ro.ase.cts.clase;

public class RezervareMasa implements ICommand{
    private Masa masa;

    public RezervareMasa(Masa masa) {
        this.masa = masa;
    }

    @Override
    public void executa() {
        masa.rezervaMasa();
    }
}
