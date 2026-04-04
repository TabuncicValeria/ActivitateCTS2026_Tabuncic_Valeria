package ro.ase.cts.model;

import java.util.ArrayList;
import java.util.List;

public class PortraitPreset extends AbstractPhotoPreset{

    public PortraitPreset(String numePreset, List<String> filtreAplicate, ExportSettings exportSettings, double intensitate) {
        super(numePreset, filtreAplicate, exportSettings, intensitate);
    }

    @Override
    public IPhotoPreset copiaza() {
        return new PortraitPreset(this.numePreset,
                new ArrayList<>(this.filtreAplicate),
                new ExportSettings(this.exportSettings),
                this.intensitate);
    }

    @Override
    public void aplicaPreset() {
        System.out.println("PortraitPreset cu aplicarea filtrelor: "+filtreAplicate);
    }
}
