package ro.ase.cts.Singleton.model;

public class DroneConnection implements IDroneConnection {

    private String ip;
    private int port;
    private boolean connected;

    private static DroneConnection instanta=null;

    private DroneConnection(String ip, int port) {
        this.ip = ip;
        this.port = port;
        this.connected=false;
    }

    public static DroneConnection getInstanta(String ip,int port)
    {
        if(instanta==null)
        {
            instanta=new DroneConnection(ip,port);
        }
        return instanta;
    }


    @Override
    public void connect() {
        if(connected)
        {
            System.out.println("Drona este deja conectata la un port!");
            return;
        }
        connected=true;
        System.out.println("Drona a fost conectata! ");
    }

    @Override
    public void disconnect() {
        if(!connected)
        {
            System.out.println("Nu exista nici o drona conectata!");
            return;
        }
        connected=false;
        System.out.println("Drona a fost deconectata! ");

    }

    @Override
    public boolean isConnected() {
        return connected;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DroneConnection{");
        sb.append("ip='").append(ip).append('\'');
        sb.append(", port=").append(port);
        sb.append(", isConnected=").append(connected);
        sb.append('}');
        return sb.toString();
    }
}
