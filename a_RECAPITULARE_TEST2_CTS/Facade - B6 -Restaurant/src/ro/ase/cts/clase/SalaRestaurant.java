package ro.ase.cts.clase;

public class SalaRestaurant {
    private Masa[] mese=new Masa[5];
    public SalaRestaurant(){
        mese[0]=new Masa(1,2,true,true,true);
        mese[1]=new Masa(2,4,true,false,true);
        mese[2] = new Masa(3, 4, true, true, false);
        mese[3] = new Masa(4, 6, false, true, true);
        mese[4] = new Masa(5, 8, true, true, true);
    }

    public Masa getMasaLibera(int numarPersoane)
    {
        for(int i=0;i<mese.length;i++){
            if(mese[i].isLibera()&&mese[i].getCapacitate()>=numarPersoane)
            {
                return mese[i];
            }
        }
        return null;
    }

    public void ocupaMasa(Masa masa){
        masa.ocupaMasa();
    }
}
