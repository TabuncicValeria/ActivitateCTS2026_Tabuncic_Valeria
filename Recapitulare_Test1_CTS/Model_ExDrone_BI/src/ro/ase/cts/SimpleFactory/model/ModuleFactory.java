package ro.ase.cts.SimpleFactory.model;

public class ModuleFactory {
    public AbstractModule getModule(ModuleType tip, String name,String description,float price)
    {
        switch(tip){
            case NIGHT_VISION:
                return new NightVision(name,description,price,200,true);
            case GPS_TRACKING:
                return new GpsTracking(name,description,price,100,true);
            case HIGH_RESOLUTION_CAMERA:
                return new HighResolutionCamera(name,description,price,100,100);
            case URMARIRE_INTELIGENTA:
                return new UrmarireInteligenta(name,description,price,10,24);
            case BATERIE_SUPLIMENTARA:
                return new BaterieSuplimentara(name,description,price,1,5);
            default:
                throw new IllegalArgumentException("Nu este un modul valid!");
        }
    }
}
