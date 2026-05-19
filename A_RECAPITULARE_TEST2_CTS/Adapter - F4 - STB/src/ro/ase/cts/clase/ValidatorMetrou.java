package ro.ase.cts.clase;

public class ValidatorMetrou {
    public float pret;
    public float durata;

    public ValidatorMetrou(float pret, float durata) {
        this.pret = pret;
        this.durata = durata;
    }

    public void valideazaBiletMetrou() {
        System.out.println("Biletul de transport subteran in comun la pretul de "+pret+" lei, ofera posibilitatea de calatorie timp de "+durata+"ore si a fost validat.");
    }


    public void valideazaAbonamentMetrou() {
        System.out.println("Abonamentul pentru transport subteran in comun la pretul de "+pret+" lei, ofera posibilitatea de calatorie timp de "+durata+"zile si a fost validat.");
    }
}
