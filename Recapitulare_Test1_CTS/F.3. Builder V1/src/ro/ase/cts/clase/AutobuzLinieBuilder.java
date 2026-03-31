package ro.ase.cts.clase;

public class AutobuzLinieBuilder implements IBuilder {

    private AutobuzLinie autobuzLinie;

    public AutobuzLinieBuilder(String model,String sofer)
    {
        autobuzLinie=new AutobuzLinie(model,sofer,false,false,"");
    }

    @Override
    public AutobuzLinie build() {
        return autobuzLinie;
    }

    public AutobuzLinieBuilder setModelAutobuz(String modelAutobuz) {
        this.autobuzLinie.setModelAutobuz(modelAutobuz);
        return this;
    }
    public AutobuzLinieBuilder setSofer(String sofer) {
        this.autobuzLinie.setSofer(sofer);
        return this;
    }
    public AutobuzLinieBuilder setAreOpririLaCapat(boolean opriri) {
        this.autobuzLinie.setAreOpririLaCapat(opriri);
        return this;
    }
    public AutobuzLinieBuilder setDeschideUsileLaFiecareStatie(boolean usi) {
        this.autobuzLinie.setDeschideUsileLaFiecareStatie(usi);
        return this;
    }
    public AutobuzLinieBuilder setTextEcranDerulator(String text) {
        this.autobuzLinie.setTextEcranDerulator(text);
        return this;
    }

}
