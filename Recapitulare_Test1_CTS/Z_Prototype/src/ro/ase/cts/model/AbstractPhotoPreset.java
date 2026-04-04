package ro.ase.cts.model;

import java.util.List;

public abstract class AbstractPhotoPreset implements IPhotoPreset{
    protected String numePreset;
    protected List<String> filtreAplicate;
    protected ExportSettings exportSettings;
    protected double intensitate;

    public AbstractPhotoPreset(String numePreset, List<String> filtreAplicate,
                               ExportSettings exportSettings, double intensitate) {
        this.numePreset = numePreset;
        this.filtreAplicate = filtreAplicate;
        this.exportSettings = exportSettings;
        this.intensitate = intensitate;
    }

    public void setFiltreAplicate(List<String> filtreAplicate) {
        this.filtreAplicate = filtreAplicate;
    }

    public void setNumePreset(String numePreset) {
        this.numePreset = numePreset;
    }
}
