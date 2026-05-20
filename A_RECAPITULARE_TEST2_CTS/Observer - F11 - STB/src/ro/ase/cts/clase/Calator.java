package ro.ase.cts.clase;

//cel care primeste notificarea - observator
public class Calator implements  ICalator{
    private String numeCalator;
    private String nrTelefon;

    public Calator(String numeCalator, String nrTelefon) {
        this.numeCalator = numeCalator;
        this.nrTelefon = nrTelefon;
    }


    @Override
    public void receptioneazaNotificare(String mesaj) {
        System.out.println("Calatorul "+this.numeCalator+" receptioneaza mesajul: "+mesaj+" la numarul de telefon"+this.nrTelefon);
    }
}
