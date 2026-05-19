package ro.ase.cts.clase;

public abstract class OptiuneMeniu {
    private String denumire;
    public OptiuneMeniu(String denumire)
    {
        this.denumire=denumire;
    }

    public String getDenumire(){
        return this.denumire;
    }
    public abstract void afiseaza(String indentare);
    public void adaugaOptiune(OptiuneMeniu optiuneMeniu)
    {
        throw new UnsupportedOperationException("Operatia nu e permisa pt acest tip de nod!");
    }

    public void stergeOptiune(OptiuneMeniu optiuneMeniu)
    {
        throw new UnsupportedOperationException("Operatia nu e permisa pt acest tip de nod!");
    }

    public OptiuneMeniu getOptiuneMeniu(int index)
    {
        throw new UnsupportedOperationException("Operatia nu e permisa pt acest tip de nod!");
    }
}
