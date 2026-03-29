package ro.ase.cts.clase;
/*A.2.	În cadrul aplicației personalul spitalului este de mai multe tipuri.
 Acestea sunt salvate într-un enum { Brancardier, Asistent, Medic}. Să se
  implementeze modulul care pune la dispoziției crearea de obiecte din
   familia obiectelor PersonalSpital in funcție de tipul primit ca parametru.
 */
public abstract class PersonalSpital {
    protected String nume;
    protected int aniExperienta;
    protected double salariu;

    public PersonalSpital(String nume,int aniExperienta,double salariu)
    {
        this.nume=nume;
        this.aniExperienta=aniExperienta;
        this.salariu=salariu;
    }

    public abstract void afisareDescriere();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("nume='").append(nume).append('\'');
        sb.append(", aniExperienta=").append(aniExperienta);
        sb.append(", salariu=").append(salariu);
        return sb.toString();
    }
}
