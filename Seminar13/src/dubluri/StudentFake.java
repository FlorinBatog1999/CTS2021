package dubluri;

import java.util.List;

import clase.IStudent;

public class StudentFake implements IStudent{

	private String valoareGetNume;
	private float valoareCalculeazaMedie;
	private int valoareNota;
	private boolean valoareAreRestante;
	
	@Override
	public String getNume() {
		return this.valoareGetNume;
	}

	@Override
	public void setNume(String nume) {
		
		
	}

	@Override
	public List<Integer> getNote() {
		return null;
	}

	@Override
	public void adaugaNota(int nota) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float calculeazaMedie() {
		return this.valoareCalculeazaMedie;
	}

	@Override
	public int getNota(int index) {
		return this.valoareNota;
	}

	@Override
	public boolean areRestante() {
		return this.valoareAreRestante;
	}

	public void setValoareGetNume(String valoareGetNume) {
		this.valoareGetNume = valoareGetNume;
	}

	public void setValoareCalculeazaMedie(float valoareCalculeazaMedie) {
		this.valoareCalculeazaMedie = valoareCalculeazaMedie;
	}

	public void setValoareNota(int valoareNota) {
		this.valoareNota = valoareNota;
	}

	public void setValoareAreRestante(boolean valoareAreRestante) {
		this.valoareAreRestante = valoareAreRestante;
	}

	
	
}
