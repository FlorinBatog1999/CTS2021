package ro.ase.cts.clase;

public class Angajat extends Aplicant {
	private String ocupatie;
	private int salariu;
	private static float sumaFinantata = 30;

	public String getOcupatie() {
		return ocupatie;
	}

	public void setOcupatie(String ocupatie) {
		this.ocupatie = ocupatie;
	}

	public int getSalariu() {
		return salariu;
	}

	public void setSalariu(int salariu) {
		this.salariu = salariu;
	}

	public static float getFinantare() {
		return sumaFinantata;
	}

	public static void setFinantare(float sumaFinantata) {
		Angajat.sumaFinantata = sumaFinantata;
	}

	public Angajat(String nume, String prenume, int varsta, int punctaj, int numarProiecte, String[] denumireProiecte,
			int salariu, String ocupatie) {
		super(nume, prenume, varsta, punctaj, numarProiecte, denumireProiecte);
		this.salariu = salariu;
		this.ocupatie = ocupatie;
	}

	public Angajat() {
		super();

	}

	@Override
	public String toString() {
		StringBuilder stringBuilderAngajat = new StringBuilder("Angajat:");
		stringBuilderAngajat.append(super.toString()).append(", ocupatie ").append(ocupatie).append(", salariu")
				.append(String.valueOf(salariu));
		return stringBuilderAngajat.toString();
	}

	@Override
	public float getSumaFinantata() {
		return sumaFinantata;
	}

}
