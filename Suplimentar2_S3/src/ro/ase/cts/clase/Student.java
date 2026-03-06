package ro.ase.cts.clase;

public class Student extends Persoana{
    private final String idStudent;

    public Student(String nume, int varsta, String idStudent) {
        super(nume, varsta);
        this.idStudent = idStudent;
    }

    public String getIdStudent() {
        return idStudent;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("idStudent='").append(idStudent).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
