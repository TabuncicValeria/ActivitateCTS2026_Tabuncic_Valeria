package ro.ase.cts.clase;

import java.lang.reflect.UndeclaredThrowableException;

public abstract class NodFlota {
    private String denumire;

    public NodFlota(String denumire) {
        this.denumire = denumire;
    }

    public String getDenumire() {
        return denumire;
    }
    public abstract void afiseaza(String indentare);

    public void adaugaNod(NodFlota nod)
    {
        throw new UnsupportedOperationException("Nu se poate adauga un nou nod!");
    }
    public void stergeNod(NodFlota nod)
    {
        throw new UnsupportedOperationException("Nu se poate sterge nodul selectat!");
    }
    public NodFlota getNod(int index)
    {
        throw new UnsupportedOperationException("Nodul nu poate fi selectat!");
    }
}
