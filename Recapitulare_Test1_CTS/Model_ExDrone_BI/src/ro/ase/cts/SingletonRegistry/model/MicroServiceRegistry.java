package ro.ase.cts.SingletonRegistry.model;

import java.util.HashMap;
import java.util.Map;

public class MicroServiceRegistry extends AbstractMicroService{

    private boolean connected;
    private static final Map<String,MicroServiceRegistry> instances=new HashMap<>();


    public MicroServiceRegistry(String name, String url) {
        super(name, url);
        this.connected=false;
    }

    public static MicroServiceRegistry getInstance(String name,String url)
    {
        if(name==null||name.trim().isEmpty())
        {
            throw new IllegalArgumentException("Numele serviciului nu poate fi null!");
        }
        if(url==null||url.trim().isEmpty())
        {
            throw new IllegalArgumentException("URL ul serviciului nu poate fi null!");
        }
        MicroServiceRegistry connection=instances.get(name);
        if(connection==null)
        {
            connection=new MicroServiceRegistry(name,url);
            instances.put(name,connection);
        }
        return connection;
    }


    @Override
    public void connect() {
        if(connected)
        {
            System.out.println("Clientul este deja conectat la serviciul "+serviceName+" .");
            return;
        }
        connected=true;
        System.out.println("Conectare realizata la serviciul " + serviceName +
                " cu URL-ul " + serviceUrl + ".");
    }

    public void disconnect(){
        if(!connected)
        {
            System.out.println("Clientul nu este conectat la nici un serviciu!");
            return;
        }
        connected=false;
        System.out.println("Deconectarea a fost realizata cu succes!");
    }

    public boolean isConnected() {
        return connected;
    }

    public String getServiceName(){
        return serviceName;
    }
    public String getServiceUrl(){
        return serviceUrl;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MicroServiceRegistry{");
        sb.append("serviceName='").append(serviceName).append('\'');
        sb.append(", serviceUrl='").append(serviceUrl).append('\'');
        sb.append(", connected=").append(connected);
        sb.append('}');
        return sb.toString();
    }
}
