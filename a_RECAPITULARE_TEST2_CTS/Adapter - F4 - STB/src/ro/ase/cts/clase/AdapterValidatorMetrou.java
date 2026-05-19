package ro.ase.cts.clase;

public class AdapterValidatorMetrou extends ValidatorMetrou implements IValidatorTransport{

    public AdapterValidatorMetrou(float pret, float durata) {
        super(pret, durata);
    }

    @Override
    public void valideazaBilet() {
        super.valideazaBiletMetrou();
    }

    @Override
    public void valideazaAbonament() {
        super.valideazaAbonamentMetrou();
    }
}
