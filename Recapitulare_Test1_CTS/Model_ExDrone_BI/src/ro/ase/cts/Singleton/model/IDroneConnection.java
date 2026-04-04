package ro.ase.cts.Singleton.model;

public interface IDroneConnection {
    void connect();
    void disconnect();
    boolean isConnected();
}
