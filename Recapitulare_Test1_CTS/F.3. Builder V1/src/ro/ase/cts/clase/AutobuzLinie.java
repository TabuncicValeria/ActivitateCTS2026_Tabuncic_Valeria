package ro.ase.cts.clase;

public class AutobuzLinie {
    private  String modelAutobuz;
    private  String sofer;
    private  boolean areOpririLaCapat;
    private  boolean deschideUsileLaFiecareStatie;
    private  String textEcranDerulator;

    public AutobuzLinie(String modelAutobuz, String sofer, boolean areOpririLaCapat, boolean deschideUsileLaFiecareStatie, String textEcranDerulator) {
        this.modelAutobuz = modelAutobuz;
        this.sofer = sofer;
        this.areOpririLaCapat = areOpririLaCapat;
        this.deschideUsileLaFiecareStatie = deschideUsileLaFiecareStatie;
        this.textEcranDerulator = textEcranDerulator;
    }

    public String getModelAutobuz() {
        return modelAutobuz;
    }

    public void setModelAutobuz(String modelAutobuz) {
        this.modelAutobuz = modelAutobuz;
    }

    public String getSofer() {
        return sofer;
    }

    public void setSofer(String sofer) {
        this.sofer = sofer;
    }

    public boolean isAreOpririLaCapat() {
        return areOpririLaCapat;
    }

    public void setAreOpririLaCapat(boolean areOpririLaCapat) {
        this.areOpririLaCapat = areOpririLaCapat;
    }

    public boolean isDeschideUsileLaFiecareStatie() {
        return deschideUsileLaFiecareStatie;
    }

    public void setDeschideUsileLaFiecareStatie(boolean deschideUsileLaFiecareStatie) {
        this.deschideUsileLaFiecareStatie = deschideUsileLaFiecareStatie;
    }

    public String getTextEcranDerulator() {
        return textEcranDerulator;
    }

    public void setTextEcranDerulator(String textEcranDerulator) {
        this.textEcranDerulator = textEcranDerulator;
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

