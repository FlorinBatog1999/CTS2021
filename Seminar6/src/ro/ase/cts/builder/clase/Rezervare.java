package ro.ase.cts.builder.clase;

public class Rezervare {
	private int codRezervare;
	private boolean areMancare;
	private boolean areBautura;
	private boolean areScaunErgonomic;
	private boolean areMuzicaAmbientala;
	private String genMuzical;
	public Rezervare(int codRezervare, boolean areMancare, boolean areBautura, boolean areScaunErgonomic,
			boolean areMuzicaAmbientala, String genMuzical) {
		super();
		this.codRezervare = codRezervare;
		this.areMancare = areMancare;
		this.areBautura = areBautura;
		this.areScaunErgonomic = areScaunErgonomic;
		this.areMuzicaAmbientala = areMuzicaAmbientala;
		this.genMuzical = genMuzical;
	}
	public void setCodRezervare(int codRezervare) {
		this.codRezervare = codRezervare;
	}
	public void setAreMancare(boolean areMancare) {
		this.areMancare = areMancare;
	}
	public void setAreBautura(boolean areBautura) {
		this.areBautura = areBautura;
	}
	public void setAreScaunErgonomic(boolean areScaunErgonomic) {
		this.areScaunErgonomic = areScaunErgonomic;
	}
	public void setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
		this.areMuzicaAmbientala = areMuzicaAmbientala;
	}
	public void setGenMuzical(String genMuzical) {
		this.genMuzical = genMuzical;
	}
	@Override
	public String toString() {
		return "Rezervare [codRezervare=" + codRezervare + ", areMancare=" + areMancare + ", areBautura=" + areBautura
				+ ", areScaunErgonomic=" + areScaunErgonomic + ", areMuzicaAmbientala=" + areMuzicaAmbientala
				+ ", genMuzical=" + genMuzical + "]";
	}
	
	
	
}
