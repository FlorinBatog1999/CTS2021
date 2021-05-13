package ro.ase.cts.memento.clase;

public class Meci {
	private String echipaGazda;
	private String echipaOaspete;
	private int nrSpectatori;
	private int nrBileteVandute;
	private int nrSticleVandute;
	private int nrJandarmi;
	
	public Meci(String echipaGazda, String echipaOaspete, int nrSpectatori, int nrBileteVandute, int nrSticleVandute,
			int nrJandarmi) {
		super();
		this.echipaGazda = echipaGazda;
		this.echipaOaspete = echipaOaspete;
		this.nrSpectatori = nrSpectatori;
		this.nrBileteVandute = nrBileteVandute;
		this.nrSticleVandute = nrSticleVandute;
		this.nrJandarmi = nrJandarmi;
	}
	
	public Memento creareMemento() {
		Memento memento=new Memento(echipaGazda, echipaOaspete, nrSpectatori);
		return memento;
	}
	
	public void revenire(Memento memento) {
		this.echipaGazda=memento.getEchipaGazda();
		this.echipaOaspete=memento.getEchipaOaspete();
		this.nrBileteVandute=memento.getNrSpectatori();
	}

	
	
	@Override
	public String toString() {
		return "Meci [echipaGazda=" + echipaGazda + ", echipaOaspete=" + echipaOaspete + ", nrSpectatori="
				+ nrSpectatori + ", nrBileteVandute=" + nrBileteVandute + ", nrSticleVandute=" + nrSticleVandute
				+ ", nrJandarmi=" + nrJandarmi + "]";
	}
	
	
}
