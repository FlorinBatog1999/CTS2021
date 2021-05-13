package ro.ase.cts.memento.clase;

public class Memento {
	private String echipaGazda;
	private String echipaOaspete;
	private int nrSpectatori;
	
	public Memento(String echipaGazda, String echipaOaspete, int nrSpectatori) {
		super();
		this.echipaGazda = echipaGazda;
		this.echipaOaspete = echipaOaspete;
		this.nrSpectatori = nrSpectatori;
	}

	public String getEchipaGazda() {
		return echipaGazda;
	}

	public void setEchipaGazda(String echipaGazda) {
		this.echipaGazda = echipaGazda;
	}

	public String getEchipaOaspete() {
		return echipaOaspete;
	}

	public void setEchipaOaspete(String echipaOaspete) {
		this.echipaOaspete = echipaOaspete;
	}

	public int getNrSpectatori() {
		return nrSpectatori;
	}

	public void setNrSpectatori(int nrSpectatori) {
		this.nrSpectatori = nrSpectatori;
	}
	
	
}
