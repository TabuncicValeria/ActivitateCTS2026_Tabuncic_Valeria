package ro.ase.cts.clase;

public class Spital {
    private Medic medic;
    private Salon salon;

    public Spital(Medic medic, Salon salon) {
        this.medic = medic;
        this.salon = salon;
    }

    public void internarePacient(Pacient pacient)
    {
        if(pacient.getGravitate()>=5)
        {
            if(medic.decideInternareaPacientului(pacient)){
                int patLiber=salon.getPatLiber();
                if(patLiber!=-1)
                {
                    System.out.println("Pacientul "+pacient.getNumePacient()+" este internat in salon, patul numarul "+patLiber+" la decizia medicului "+medic.getNumeMedic()+" .");
                    salon.ocupaPatSalon(patLiber);
                }
                else {
                    System.out.println("Nu exista paturi disponibile in salon!");
                }
            }
            else {
                System.out.println("Medicul a refuzat internarea pacientului "+pacient.getNumePacient());
            }
        }
        else {
            System.out.println("Pacientul "+pacient.getNumePacient()+" nu are gravitatea necesara pentru a fi internat.");
        }
    }

}
