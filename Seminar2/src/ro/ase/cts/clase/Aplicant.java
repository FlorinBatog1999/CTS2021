package ro.ase.cts.clase;

import java.util.Arrays;

public abstract class Aplicant {
	protected String nume;
	protected String prenume;
	protected int varsta;
	protected int punctaj;
	protected int numarProiecte;
	protected String[] denumireProiect;

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public void afisareStatutProiect(Proiect proiect) {
		StringBuilder str = new StringBuilder();
		str.append("Aplicantul :").append(nume).append(" ").append(prenume);
		boolean esteAcceptat = punctaj > proiect.getPragPunctaj();
		str.append(esteAcceptat ? " a fost acceptat." : "nu a fost acceptat.");
		System.out.println(str.toString());
	}

	public int getPunctaj() {
		return punctaj;
	}

	public void setPunctaj(int punctaj) {
		this.punctaj = punctaj;
	}

	public Aplicant() {
		super();
	}

	public Aplicant(String nume, String prenume, int varsta, int punctaj, int numarProiecte, String[] denumireProiect) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.punctaj = punctaj;
		this.numarProiecte = numarProiecte;
		this.denumireProiect = denumireProiect;
	}

	public int getNumarProiecte() {
		return numarProiecte;
	}

	public String[] getDenumireProiect() {
		return denumireProiect;
	}

	public void DenumiriProiecte(int numarProiecte, String[] denumireProiecte) {
		this.numarProiecte = numarProiecte;
		this.denumireProiect = denumireProiecte;
	}

	public abstract float getSumaFinantata();

	@Override
	public String toString() {
		return "nume=" + nume + ", prenume=" + prenume + ", varsta=" + varsta + ", punctaj=" + punctaj
				+ ", nr_proiecte=" + numarProiecte + ", denumireProiect=" + Arrays.toString(denumireProiect);
	}

}
