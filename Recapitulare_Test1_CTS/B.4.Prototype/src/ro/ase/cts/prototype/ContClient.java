package ro.ase.cts.prototype;

import java.util.ArrayList;
import java.util.List;

public class ContClient implements ContClientPrototype {

    private String nume;
    private String numarTelefon;
    private String email;
    private int numarPersoanePreferat;
    private List<String> cerinteSpeciale;

    public ContClient(){

    }

    public ContClient(String nume, String numarTelefon, String email, int numarPersoanePreferat, List<String> cerinteSpeciale) {
        if(nume==null|| nume.trim().isEmpty())
        {
            throw new IllegalArgumentException("Numele nu poate fi null sau gol!");
        }
        if(numarTelefon.length()>13)
        {
            throw new IllegalArgumentException("Numarul de Telefon nu poate avea sub 13 cifre.Este invalid!");
        }
        if(email==null||email.trim().isEmpty())
        {
            throw new IllegalArgumentException("Emailul nu poate fi null sau gol!");
        }
        if(numarPersoanePreferat<1)
        {
            throw new IllegalArgumentException("Trebuie sa existe cel putin un client pentru care se solicita rezervarea!");
        }

        this.nume = nume;
        this.numarTelefon = numarTelefon;
        this.email = email;
        this.numarPersoanePreferat = numarPersoanePreferat;
        this.cerinteSpeciale = new ArrayList<>(cerinteSpeciale);
    }

    @Override
    public ContClient copiaza() {
        ContClient copie=new ContClient();
        copie.nume=this.nume;
        copie.numarTelefon=this.numarTelefon;
        copie.email=this.email;
        copie.numarPersoanePreferat=this.numarPersoanePreferat;
        copie.cerinteSpeciale=new ArrayList<>(this.cerinteSpeciale);
        return copie;
    }

    public void afisareDescriere()
    {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContClient{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", numarTelefon='").append(numarTelefon).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", numarPersoanePreferat=").append(numarPersoanePreferat);
        sb.append(", cerinteSpeciale=").append(cerinteSpeciale);
        sb.append('}');
        return sb.toString();
    }
}
