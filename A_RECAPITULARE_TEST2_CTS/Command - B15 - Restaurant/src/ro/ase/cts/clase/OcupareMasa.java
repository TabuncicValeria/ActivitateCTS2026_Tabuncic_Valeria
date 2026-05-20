package ro.ase.cts.clase;

public class OcupareMasa implements ICommand{
    private Masa masa;

    public OcupareMasa(Masa masa) {
        this.masa = masa;
    }

    @Override
    public void executa() {
        masa.ocupaMasa();
    }
}
