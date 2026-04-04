package ro.ase.cts.main;

import ro.ase.cts.model.CinematicPreset;
import ro.ase.cts.model.ExportSettings;
import ro.ase.cts.model.PortraitPreset;
import ro.ase.cts.model.VIntagePreset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Prototype");
        List<String> filtre1=new ArrayList<>();
        filtre1.add("Skin Smooth");
        filtre1.add("Light Glow");
        filtre1.add("Color Balance");

        PortraitPreset portraitPrototype = new PortraitPreset(
                "Soft Portrait",
                filtre1,
                new ExportSettings("JPG", 90),
                0.8
        );

        VIntagePreset vintagePrototype = new VIntagePreset(
                "Old Memories",
                Arrays.asList("Sepia", "Grain", "Fade"),
                new ExportSettings("PNG", 85),
                0.7
        );

        CinematicPreset cinematicPrototype = new CinematicPreset(
                "Movie Look",
                Arrays.asList("Teal & Orange", "Contrast Boost", "Shadow Depth"),
                new ExportSettings("TIFF", 95),
                0.95
        );

        System.out.println("=== PROTOTIPURI INITIALE ===");
        portraitPrototype.aplicaPreset();
        vintagePrototype.aplicaPreset();
        cinematicPrototype.aplicaPreset();

        PortraitPreset copy1=(PortraitPreset)portraitPrototype.copiaza();
        PortraitPreset copy2 = (PortraitPreset) portraitPrototype.copiaza();
        VIntagePreset copy3 = (VIntagePreset) vintagePrototype.copiaza();
        CinematicPreset copy4 = (CinematicPreset) cinematicPrototype.copiaza();

        System.out.println("\n=== COPII CREATE ===");
        copy1.aplicaPreset();
        copy2.aplicaPreset();
        copy3.aplicaPreset();
        copy4.aplicaPreset();

        // 3. MODIFICARE COPIE
        copy1.setNumePreset ("Soft Portrait MODIFICAT");

        System.out.println("\n=== DUPA MODIFICARE COPY1 ===");

        System.out.println("ORIGINAL:");
        portraitPrototype.aplicaPreset();

        System.out.println("COPIE MODIFICATA:");
        copy1.aplicaPreset();


    }
}