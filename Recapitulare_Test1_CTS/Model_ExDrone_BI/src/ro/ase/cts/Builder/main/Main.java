package ro.ase.cts.Builder.main;

import ro.ase.cts.Builder.model.CameraModule;
import ro.ase.cts.Builder.model.Drone;
import ro.ase.cts.Builder.model.DroneBuilder;
import ro.ase.cts.Builder.model.ExtraBatteryModule;

public class Main {
    /*4.	Clasa Drone va gestiona toate detaliile dronei. Adaugă mai multe atribute (cel puțin 4-5) și
     implementează un mecanism care să permită altor dezvoltatori să creeze eficient o dronă cu orice
     combinație de module/atribute, fără posibilitatea de a le modifica ulterior (odată ce drona este creată,
     procesul de fabricație începe și nu se mai poate schimba). */
    public static void main(String[] args) {
        ExtraBatteryModule baterie = new ExtraBatteryModule(
                "Extra Battery",
                "Baterie suplimentara pentru autonomie extinsa",
                450.0f,
                3000,
                90
        );
        CameraModule camera = new CameraModule(
                "4K Camera",
                "Camera de inalta rezolutie",
                1200.0f,
                "4K",
                true
        );

        Drone drone1 = new DroneBuilder("DJI Air", "v1.0.0",120.5f,baterie)
                .setWeight(2.3f)
                .setBatteryCapacity(8000)
                .setAutonomyMinutes(55)
                .setCameraModule(camera)
                .build();

        System.out.println(drone1);
    }

}
