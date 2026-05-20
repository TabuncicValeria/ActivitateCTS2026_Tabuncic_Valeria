package ro.ase.cts.clase;

public class ValidatorTerestru implements IValidatorTransport{
    private float pret;
    private float durata;

    public ValidatorTerestru(float pret, float durata) {
        this.pret = pret;
        this.durata = durata;
    }

    @Override
    public void valideazaBilet() {
        System.out.println("Biletul de transport terestru in comun la pretul de "+pret+" lei, ofera posibilitatea de calatorie timp de "+durata+"ore si a fost validat.");
    }

    @Override
    public void valideazaAbonament() {
        System.out.println("Abonamentul pentru transport terestru in comun la pretul de "+pret+" lei, ofera posibilitatea de calatorie timp de "+durata+"zile si a fost validat.");
    }
}
