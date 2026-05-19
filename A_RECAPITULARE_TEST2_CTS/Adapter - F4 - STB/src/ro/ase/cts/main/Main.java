package ro.ase.cts.main;

import ro.ase.cts.clase.AdapterValidatorMetrou;
import ro.ase.cts.clase.IValidatorTransport;
import ro.ase.cts.clase.ValidatorTerestru;

public class Main {
    public static void main(String[] args) {

        System.out.println("Adapter - F4 - STB");
        IValidatorTransport validatorTerestru=new ValidatorTerestru(3.0f,1.5f);
        validatorTerestru.valideazaBilet();
        IValidatorTransport validatorAbonament=new ValidatorTerestru(80.0f,31.0f);
        validatorAbonament.valideazaAbonament();

        IValidatorTransport adapter=new AdapterValidatorMetrou(5.0f,2.0f);
        adapter.valideazaBilet();
        IValidatorTransport adapterAbonament=new AdapterValidatorMetrou(100.0f,31.0f);
        adapterAbonament.valideazaAbonament();
    }
}