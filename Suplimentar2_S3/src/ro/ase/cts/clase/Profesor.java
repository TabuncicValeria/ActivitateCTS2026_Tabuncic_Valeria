package ro.ase.cts.clase;

import ro.ase.cts.interfete.IPredabil;

public class Profesor extends Persoana implements IPredabil {
    private final String idAngajat;

    public Profesor(String nume, int varsta, String idAngajat) {
        super(nume, varsta);
        this.idAngajat = idAngajat;
    }

    public String getIdAngajat() {
        return idAngajat;
    }

    @Override
    public void preda() {
        System.out.println("Profesorul "+getNume()+" este titularul de curs.");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Profesor{");
        sb.append("idAngajat='").append(idAngajat).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
