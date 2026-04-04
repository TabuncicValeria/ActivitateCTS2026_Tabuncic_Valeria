package ro.ase.cts.model;

import java.util.ArrayList;
import java.util.List;

public class VIntagePreset extends AbstractPhotoPreset{

    public VIntagePreset(String numePreset, List<String> filtreAplicate, ExportSettings exportSettings, double intensitate) {
        super(numePreset, filtreAplicate, exportSettings, intensitate);
    }

    @Override
    public IPhotoPreset copiaza() {
        return new VIntagePreset(this.numePreset,
                new ArrayList<>(this.filtreAplicate),
                new ExportSettings(this.exportSettings),
                this.intensitate);
    }

    @Override
    public void aplicaPreset() {
        System.out.println("VintagePreset cu aplicarea filtrelor: "+filtreAplicate);
    }
}
