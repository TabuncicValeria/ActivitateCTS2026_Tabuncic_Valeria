package ro.ase.cts.model;

public class AlertaServer {
    private String idServer;
    private String mesaj;
    private int severitate;

    public AlertaServer(String idServer, String mesaj, int severitate) {
        this.idServer = idServer;
        this.mesaj = mesaj;
        this.severitate = severitate;
    }

    public String getIdServer() {
        return idServer;
    }

    public String getMesaj() {
        return mesaj;
    }

    public int getSeveritate() {
        return severitate;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AlertaServer{");
        sb.append("idServer='").append(idServer).append('\'');
        sb.append(", mesaj='").append(mesaj).append('\'');
        sb.append(", severitate=").append(severitate);
        sb.append('}');
        return sb.toString();
    }
}
