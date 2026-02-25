package ro.ase.cts.hotel;

public class Client {
    private final String id;// setam id-ul ca fiind final pt a nu putea fi modificat
    private String nume;
    private String email;

    //constructor cu toti parametrii + validare id (PK)
    public Client(String id, String nume, String email) {
        if(id==null||id.isBlank()) throw new IllegalArgumentException("Id-ul introdus nu este valid!");
        this.id = id;
        this.nume = nume;
        this.email = email;
    }

    //meth. de acces

    public String getId() {
        return id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        if(nume==null|| nume.trim().length()<3) //trim() elimina sp. albe de la inceputl / sfarsitul unui String
        {
            throw new IllegalArgumentException("Numele trebuie sa fie format din minim 3 caractere!");
        }
        this.nume = nume;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(!email.contains("@"))
            throw new IllegalArgumentException("Adresa de email nu este valida!");
        this.email = email;
    }

    @Override
    public String toString() {
        return "Clientul cu id-ul "+ id+" se numeste "+nume+" si are adresa: "+email;
    }
}

