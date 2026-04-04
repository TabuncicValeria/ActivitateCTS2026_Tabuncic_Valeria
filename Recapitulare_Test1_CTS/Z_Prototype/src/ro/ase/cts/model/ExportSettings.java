package ro.ase.cts.model;

public class ExportSettings {
    private String format;
    private int quality;

    public ExportSettings(String format, int quality) {
        this.format = format;
        this.quality = quality;
    }

    public ExportSettings(ExportSettings other) {
        this.format = other.format;
        this.quality = other.quality;
    }

    @Override
    public String toString() {
        return "ExportSettings{" +
                "format='" + format + '\'' +
                ", quality=" + quality +
                '}';
    }
}
