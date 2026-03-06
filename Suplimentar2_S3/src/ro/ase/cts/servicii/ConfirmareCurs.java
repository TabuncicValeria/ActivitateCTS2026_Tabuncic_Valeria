package ro.ase.cts.servicii;

import ro.ase.cts.clase.Curs;

public class ConfirmareCurs {
    public boolean esteConfirmat(Curs curs)
    {
        if(curs==null)
        {
            return false;
        }
        boolean areNumeValid=curs.getNumeCurs()!=null &&!curs.getNumeCurs().trim().isEmpty();
        boolean areCrediteValide=curs.getCredite()>0;
        boolean areProfesor=curs.getProfesor()!=null;

        return areNumeValid&areCrediteValide&areProfesor;

    }
}
