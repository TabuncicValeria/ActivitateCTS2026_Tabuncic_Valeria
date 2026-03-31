package ro.ase.cts.clase;

public class AutobuzLinie {
    private final String modelAutobuz;
    private final String sofer;
    private final boolean areOpririLaCapat;
    private final boolean deschideUsileLaFiecareStatie;
    private final String textEcranDerulator;

    public AutobuzLinie(String modelAutobuz, String sofer, boolean areOpririLaCapat, boolean deschideUsileLaFiecareStatie, String textEcranDerulator) {
        this.modelAutobuz = modelAutobuz;
        this.sofer = sofer;
        this.areOpririLaCapat = areOpririLaCapat;
        this.deschideUsileLaFiecareStatie = deschideUsileLaFiecareStatie;
        this.textEcranDerulator = textEcranDerulator;
    }

    public String getSofer() {
        return sofer;
    }


    public String getModelAutobuz() {
        return modelAutobuz;
    }


    public boolean isAreOpririLaCapat() {
        return areOpririLaCapat;
    }


    public boolean isDeschideUsileLaFiecareStatie() {
        return deschideUsileLaFiecareStatie;
    }


    public String getTextEcranDerulator() {
        return textEcranDerulator;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AutobuzLinie{");
        sb.append("modelAutobuz='").append(modelAutobuz).append('\'');
        sb.append(", sofer='").append(sofer).append('\'');
        sb.append(", areOpririLaCapat=").append(areOpririLaCapat);
        sb.append(", deschideUsileLaFiecareStatie=").append(deschideUsileLaFiecareStatie);
        sb.append(", textEcranDerulator='").append(textEcranDerulator).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
