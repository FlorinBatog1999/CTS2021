package ro.ase.cts.strategy.clase;

public class Client{
	private String nume;
	private ModPlata modPlata;

	public Client(String nume,ModPlata modPlata) {
		super();
		this.nume=nume;
		this.modPlata = modPlata;
	}

	public void setModPlata(ModPlata modPlata) {
		this.modPlata = modPlata;
	}
	
	public void plata(float suma) {
		System.out.println(this.nume+" are de platit suma de "+suma);
		this.modPlata.achita(suma);
	}
}
