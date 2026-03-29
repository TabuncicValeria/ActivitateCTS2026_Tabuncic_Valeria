package ro.ase.cts.clase;

public class FabricaPersonalSpital {

    public PersonalSpital getPersonal(
            TipPersonalSpital tipPersonalMedical,
            String nume,
            int aniExperienta,
            double salariu) {

        switch (tipPersonalMedical) {
            case MEDIC:
                return new Medic(nume, aniExperienta, salariu);

            case ASISTENT:
                return new Asistent(nume, aniExperienta, salariu);

            case BRANCARDIER:
                return new Brancardier(nume, aniExperienta, salariu);

            default:
                throw new IllegalArgumentException("Nu exista acest post in spital!");
        }
    }
}