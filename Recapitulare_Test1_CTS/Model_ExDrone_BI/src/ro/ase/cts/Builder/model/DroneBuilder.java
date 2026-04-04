package ro.ase.cts.Builder.model;

public class DroneBuilder implements IBuilder {
    private String model;
    private String softwareVersion;
    private float maxSpeed;
    private float weight;
    private int batteryCapacity;
    private int autonomyMinutes;
    private boolean gpsEnabled;
    private AbstractModule extraBattery;
    private AbstractModule cameraModule;

    public DroneBuilder(String model, String softwareVersion, float maxSpeed,  AbstractModule extraBattery) {
        this.model = model;
        this.softwareVersion = softwareVersion;
        this.maxSpeed = maxSpeed;
        this.weight = 1.5f;
        this.batteryCapacity =5000;
        this.autonomyMinutes = 30;
        this.gpsEnabled = false;
        this.extraBattery = null;
        this.cameraModule =null;
    }

    @Override
    public Drone build() {
        return new Drone(model,softwareVersion,maxSpeed,weight,
                batteryCapacity,autonomyMinutes,gpsEnabled,extraBattery,cameraModule);
    }

    public DroneBuilder setWeight(float weight) {
        this.weight = weight;
        return this;
    }

    public DroneBuilder setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
        return this;
    }

    public DroneBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public DroneBuilder setMaxSpeed(float maxSpeed) {
        this.maxSpeed = maxSpeed;
        return this;
    }

    public DroneBuilder setGpsEnabled(boolean gpsEnabled) {
        this.gpsEnabled = gpsEnabled;
        return this;
    }

    public DroneBuilder setExtraBattery(AbstractModule extraBattery) {
        this.extraBattery = extraBattery;
        return this;
    }

    public DroneBuilder setCameraModule(AbstractModule cameraModule) {
        this.cameraModule = cameraModule;
        return this;
    }

    public DroneBuilder setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
        return this;
    }

    public DroneBuilder setAutonomyMinutes(int autonomyMinutes) {
        this.autonomyMinutes = autonomyMinutes;
        return this;
    }
}
