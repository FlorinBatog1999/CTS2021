package ro.ase.cts.clase;

public class Student extends Aplicant {
	protected String facultate;
	protected int anStudii;
	private static float sumaFinantata = 20;

	public String getFacultate() {
		return facultate;
	}

	public void setFacultate(String facultate) {
		this.facultate = facultate;
	}

	public int getAnStudii() {
		return anStudii;
	}

	public void setAnStudii(int anStudii) {
		this.anStudii = anStudii;
	}

	public Student() {
		super();

	}

	public Student(String nume, String prenume, int varsta, int punctaj, int numarProiecte, String[] denumireProiect,
			String facultate, int anStudii) {
		super(nume, prenume, varsta, punctaj, numarProiecte, denumireProiect);
		this.facultate = facultate;
		this.anStudii = anStudii;
	}

	@Override
	public String toString() {
		StringBuilder stringBuilderStudent = new StringBuilder("Student:");
		stringBuilderStudent.append(super.toString());
		stringBuilderStudent.append(", facultate").append(facultate).append(", an studii ")
				.append(String.valueOf(anStudii));
		return stringBuilderStudent.toString();
	}

	@Override
	public float getSumaFinantata() {
		return sumaFinantata;
	}

	public static float getFinantare() {
		return sumaFinantata;
	}

	public static void setFinantare(float sumaFinantata) {
		Student.sumaFinantata = sumaFinantata;
	}

}
