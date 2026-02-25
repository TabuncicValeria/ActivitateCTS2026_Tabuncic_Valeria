package ro.ase.cts.hotel;

//cl. abstracta = oblig clasele copil sa impl aceleasi metode, nu poate fi instantiata, e ca o categorie generala pe care o particularizez
public abstract  class ServiciuHotel {
    private final String denumire;
    protected double pretBaza;// trb sa coresupunda doar claselor copil:cazare,mic dejun..

    public ServiciuHotel(String denumire, double pretBaza) {
        this.denumire = denumire;
        this.pretBaza = pretBaza;
    }

    public String getDenumire() {
        return denumire;
    }

    public abstract double calculeazaCost();
    @Override
    public String toString() {
        return "Serviciul: "+denumire+" este la pretul de "+pretBaza+" lei";
    }
}

