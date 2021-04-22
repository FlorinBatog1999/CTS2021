package ro.ase.cts.state.clase;

public class Masa {
	private int numar;
	private State stare;
	
	public Masa(int numar) {
		super();
		this.numar = numar;
		this.stare = new Libera();
	}

	public int getNumar() {
		return numar;
	}

	public void setNumar(int numar) {
		this.numar = numar;
	}

	public State getStare() {
		return stare;
	}
	
	
	// request() din diagrama

	void setStare(State stare) {
		this.stare = stare;
	}

	public void rezerva() {
		Rezervata rezervata=new Rezervata();
		//Pasam responsabilitate obiectului
		//rezervata de a schimba starea mesei
		//schimbaStarea se ocupa de validari
		rezervata.schimbaStarea(this);
	}
	public void ocupa() {
		Ocupata ocupata=new Ocupata();
		ocupata.schimbaStarea(this);
	}
	public void elibereaza() {
		Libera libera=new Libera();
		libera.schimbaStarea(this);
	}


}
