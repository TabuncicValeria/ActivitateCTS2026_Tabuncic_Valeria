package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class GrupAutobuze extends NodFlota{
    private List<NodFlota> listaNoduri;

    public GrupAutobuze(String denumire) {
        super(denumire);
        this.listaNoduri=new ArrayList<>();
    }

    public void adaugaNod(NodFlota nod)
    {
        listaNoduri.add(nod);
    }
    public void stergeNod(NodFlota nod)
    {
        listaNoduri.remove(nod);
    }

    public NodFlota getNod(int index)
    {
        return listaNoduri.get(index);
    }


    @Override
    public void afiseaza(String indentare) {
        System.out.println(indentare+" "+getDenumire());
        for(NodFlota nod:listaNoduri)
        {
            nod.afiseaza(indentare+"  ");
        }
    }
}
