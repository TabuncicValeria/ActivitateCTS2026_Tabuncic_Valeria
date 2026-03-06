package ro.ase.cts.clase;

import ro.ase.cts.interfete.IPredabil;

import java.util.ArrayList;
import java.util.List;

public class Curs {
    private final String numeCurs;
    private final int credite;
    private final IPredabil profesor;
    private final List<Student> studenti;

    public Curs(String numeCurs, int credite, IPredabil profesor) {
        this.numeCurs = numeCurs;
        this.credite = credite;
        this.profesor = profesor;
        this.studenti=new ArrayList<>();
    }

    public int getCredite() {
        return credite;
    }

    public String getNumeCurs() {
        return numeCurs;
    }

    public IPredabil getProfesor() {
        return profesor;
    }

    public List<Student> getStudenti() {
        return studenti;
    }

    public void adaugaStudent(Student student)
    {
        this.studenti.add(student);
    }

    public int getNumarStudenti(){
        return this.studenti.size();
    }
}
