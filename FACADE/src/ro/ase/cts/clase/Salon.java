package ro.ase.cts.clase;

public class Salon {
   private boolean[] paturiLibere=new boolean[10];

   public Salon(){
       paturiLibere[1]=true;
       paturiLibere[3]=true;
       paturiLibere[5]=true;
       paturiLibere[7]=true;
       paturiLibere[8]=true;
   }

    public int getPatLiber(){
        for (int i = 0; i < paturiLibere.length; i++) {
            if(paturiLibere[i]) {
                return i;
            }
        }
        return -1;
    }

    public void ocupaPat(int index){
       this.paturiLibere[index]=false;
    }
}
