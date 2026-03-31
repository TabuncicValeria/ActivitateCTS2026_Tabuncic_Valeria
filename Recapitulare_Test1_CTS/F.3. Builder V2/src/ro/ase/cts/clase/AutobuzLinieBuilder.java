package ro.ase.cts.clase;

public class AutobuzLinieBuilder implements IBuilder {
    private String modelAutobuz;
    private String sofer;
    private boolean areOpririLaCapat;
    private boolean deschideUsileLaFiecareStatie;
    private String textEcranDerulator;

    public AutobuzLinieBuilder(String modelAutobuz,String sofer) {
        this.modelAutobuz = modelAutobuz;
        this.sofer = sofer;
        this.areOpririLaCapat = false;
        this.deschideUsileLaFiecareStatie = false;
        this.textEcranDerulator = "-";
    }

    public AutobuzLinieBuilder setModelAutobuz(String modelAutobuz) {
        this.modelAutobuz = modelAutobuz;
        return this;
    }

    public AutobuzLinieBuilder setSofer(String sofer) {
        this.sofer = sofer;
        return this;
    }

    public AutobuzLinieBuilder setAreOpririLaCapat(boolean areOpririLaCapat) {
        this.areOpririLaCapat = areOpririLaCapat;
        return this;
    }

    public AutobuzLinieBuilder setDeschideUsileLaFiecareStatie(boolean deschideUsileLaFiecareStatie) {
        this.deschideUsileLaFiecareStatie = deschideUsileLaFiecareStatie;
        return this;
    }

    public AutobuzLinieBuilder setTextEcranDerulator(String textEcranDerulator) {
        this.textEcranDerulator = textEcranDerulator;
        return this;
    }

    @Override
    public AutobuzLinie build() {
        return new AutobuzLinie(modelAutobuz,sofer,areOpririLaCapat,deschideUsileLaFiecareStatie,textEcranDerulator);
    }
}
