package ro.ase.cts.clase;

public class Rezervare implements IRezervare{
    private int numarMasa;

    public Rezervare(int numarMasa) {
        this.numarMasa = numarMasa;
    }


    @Override
    public void realizeazaRezervare(String numeClient, int numarPersoane) {
        System.out.println("Rezervarea pentru clientul "+numeClient+" a fost realizata la masa "+numarMasa+" pentru "+numarPersoane+" persoane.");
    }
}
