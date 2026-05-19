package ro.ase.cts.clase;

public class Rezultat implements IRezultatPrintat {
    private String numePacient;
    private String numeMedic;
    private String data;

    public Rezultat(String numePacient, String numeMedic, String data) {
        this.numePacient = numePacient;
        this.numeMedic = numeMedic;
        this.data = data;
    }

    public String getNumePacient() {
        return numePacient;
    }

    public String getNumeMedic() {
        return numeMedic;
    }

    public String getData() {
        return data;
    }

    @Override
    public void printeazaRezultat() {
        System.out.println("Sunt printate rezultatele analizelor pentru pacientul "+this.numePacient+". Analizele au fost colectate" +
                "de medicul specialist "+this.numeMedic+" la data de "+this.data+" .");
    }
}
