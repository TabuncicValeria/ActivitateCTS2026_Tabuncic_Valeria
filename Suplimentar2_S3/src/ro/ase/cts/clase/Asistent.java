package ro.ase.cts.clase;

import ro.ase.cts.interfete.IPredabil;

public class Asistent extends Persoana implements IPredabil {
    private final String idAsistent;

    public Asistent(String nume, int varsta, String idAsistent) {
        super(nume, varsta);
        this.idAsistent = idAsistent;
    }

    public String getIdAsistent() {
        return idAsistent;
    }

    @Override
    public void preda() {
        System.out.println("Asistentul "+getNume()+" preda in cadrul ASE.");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Asistent{");
        sb.append("idAsistent='").append(idAsistent).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
