package ro.ase.cts.clase;

public class Salon {
    private boolean[] listaPaturiLibere=new boolean[10];

    public Salon() {
        listaPaturiLibere[1]=true;
        listaPaturiLibere[4]=true;
        listaPaturiLibere[5]=true;
        listaPaturiLibere[9]=true;
    }

    public int getPatLiber(){
        for(int i=0;i<listaPaturiLibere.length;i++){
            if(listaPaturiLibere[i])
            {
                return i;
            }
        }
        return -1;
    }

    public void ocupaPatSalon(int index)
    {
        this.listaPaturiLibere[index]=false;
    }
}
