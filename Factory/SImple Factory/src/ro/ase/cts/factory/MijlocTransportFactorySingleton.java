package ro.ase.cts.factory;

public class MijlocTransportFactorySingleton {
    public static MijlocTransportFcatory instance;
    public static MijlocTransportFcatory getInstance(){
        if(instance==null)
        {
            instance=new MijlocTransportFcatory();
        }
        return instance;
    }
    //private MijlocTransportFcatory(){}
}
