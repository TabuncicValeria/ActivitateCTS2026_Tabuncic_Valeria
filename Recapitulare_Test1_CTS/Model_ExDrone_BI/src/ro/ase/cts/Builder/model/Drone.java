package ro.ase.cts.Builder.model;

public class Drone {
    private final String model;
    private final String softwareVersion;
    private final float maxSpeed;
    private final float weight;
    private final int batteryCapacity;
    private final int autonomyMinutes;
    private final boolean gpsEnabled;
    private final AbstractModule extraBattery;
    private final AbstractModule cameraModule;

    public Drone(String model, String softwareVersion, float maxSpeed, float weight, int batteryCapacity, int autonomyMinutes, boolean gpsEnabled, AbstractModule extraBattery, AbstractModule cameraModule) {
        this.model = model;
        this.softwareVersion = softwareVersion;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.batteryCapacity = batteryCapacity;
        this.autonomyMinutes = autonomyMinutes;
        this.gpsEnabled = gpsEnabled;
        this.extraBattery = extraBattery;
        this.cameraModule = cameraModule;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Drone{");
        sb.append("model='").append(model).append('\'');
        sb.append(", softwareVersion='").append(softwareVersion).append('\'');
        sb.append(", maxSpeed=").append(maxSpeed);
        sb.append(", weight=").append(weight);
        sb.append(", batteryCapacity=").append(batteryCapacity);
        sb.append(", autonomyMinutes=").append(autonomyMinutes);
        sb.append(", gpsEnabled=").append(gpsEnabled);
        sb.append(", extraBattery=").append(extraBattery);
        sb.append(", cameraModule=").append(cameraModule);
        sb.append('}');
        return sb.toString();
    }
}
