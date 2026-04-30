package ro.ase.cts.main;

import ro.ase.cts.clase.Autobuz;
import ro.ase.cts.clase.AutobuzCursaSpeciala;
import ro.ase.cts.clase.AutobuzDeNoapte;
import ro.ase.cts.clase.MijlocDeTransport;

public class Main {
    public static void main(String[] args) {
        System.out.println("PROXY - F8");
        MijlocDeTransport mijlocDeTransport=new Autobuz("182",20);
        mijlocDeTransport.opresteInStatie();
        mijlocDeTransport.opresteInStatie();

        MijlocDeTransport mijlocDeTransport1=new AutobuzDeNoapte(mijlocDeTransport);
        mijlocDeTransport1.opresteInStatie();

        MijlocDeTransport autobuz2=new Autobuz("234",0);
        autobuz2.opresteInStatie();
        MijlocDeTransport autobuzNoapte2=new AutobuzDeNoapte(autobuz2);
        autobuzNoapte2.opresteInStatie();

        MijlocDeTransport autobuz3=new Autobuz("300speciala",0);
        autobuz3.opresteInStatie();
        MijlocDeTransport autobuzCursaSpeciala=new AutobuzCursaSpeciala(autobuz3);
        autobuzCursaSpeciala.opresteInStatie();
    }
}