package ro.ase.cts.clase;

import java.util.Arrays;

public class Elev extends Aplicant{
	private int clasa;
	private String tutore;
	private static int sumaFinantare=30;

	public static void setSumaFinantare(int sumaFinantare)
	{
		Elev.sumaFinantare=sumaFinantare;
	}
	public int getClasa()
	{
		return clasa;
	}
	public void setClasa(int i)
	{
		this.clasa = i;
	}
	public String getTutore()
	{
		return tutore;
	}
	public void setTutore(String tutore)
	{
		this.tutore = tutore;
	}


	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Elev{");
		sb.append(super.toString());
		sb.append("clasa=").append(clasa);
		sb.append(", tutore='").append(tutore).append('\'');
		sb.append('}');
		return sb.toString();
	}

	public Elev() {
		super();
	}
	
	public Elev(String nume, String prenume, int varsta, int punctaj,
			int nrProiecte, String[] denumireProiect, int clasa, String tutore) {
		super(nume,prenume,varsta,punctaj,nrProiecte,denumireProiect);
		this.clasa = clasa;
		this.tutore = tutore;
	}

	public void afisareFinantare() {

		System.out.println("Elevul " + getNume() + " " + getPrenume() + " primeste" + Elev.sumaFinantare + " Euro/zi in proiect.");
	}
	
}
