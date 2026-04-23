package ro.ase.cts.clase.spital;

public class Medicament {
    private String numeMedicament;
    private float pretMedicament;

    public Medicament(String numeMedicament, float pretMedicament) {
        this.numeMedicament = numeMedicament;
        this.pretMedicament = pretMedicament;
    }

    public void achizitioneazaMedicament(){
        if(prezintaReteta())
        {
            System.out.println("Este achizitionat medicamentul "+this.numeMedicament+" la pretul de  "+this.pretMedicament+" lei.");
        }
        else {
            System.out.println("Pentru medicamentul "+this.numeMedicament+" este necesara prezentarea retetei.");
        }
    }

    private boolean prezintaReteta(){

        return numeMedicament.contains("reteta");
    }

    public String getNumeMedicament() {
        return numeMedicament;
    }


}
