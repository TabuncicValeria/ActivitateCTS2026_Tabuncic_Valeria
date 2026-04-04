package ro.ase.cts.model;

import java.util.ArrayList;
import java.util.List;

public class CinematicPreset extends AbstractPhotoPreset{

    public CinematicPreset(String numePreset, List<String> filtreAplicate, ExportSettings exportSettings, double intensitate) {
        super(numePreset, filtreAplicate, exportSettings, intensitate);
    }

    @Override
    public IPhotoPreset copiaza() {
        return new CinematicPreset(this.numePreset,
                new ArrayList<>(this.filtreAplicate),
                new ExportSettings(this.exportSettings),
                this.intensitate);
    }

    @Override
    public void aplicaPreset() {
        System.out.println("CinematicPreset cu aplicarea filtrelor: "+filtreAplicate);
    }
}
