package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class SectiuneMeniu extends OptiuneMeniu{
    private List<OptiuneMeniu> optiuni;

    public SectiuneMeniu(String denumire) {
        super(denumire);
        this.optiuni=new ArrayList<>();
    }

    @Override
    public void adaugaOptiune(OptiuneMeniu optiuneMeniu) {
        this.optiuni.add(optiuneMeniu);
    }

    @Override
    public OptiuneMeniu getOptiuneMeniu(int index) {
        return this.optiuni.get(index);
    }

    @Override
    public void stergeOptiune(OptiuneMeniu optiuneMeniu) {
        this.optiuni.remove(optiuneMeniu);
    }

    @Override
    public void afiseaza(String indentare) {
        System.out.println(indentare+"Sectiune: "+ getDenumire());
        for(OptiuneMeniu optiune:optiuni)
        {
            optiune.afiseaza(indentare+"  ");
        }
    }
}
