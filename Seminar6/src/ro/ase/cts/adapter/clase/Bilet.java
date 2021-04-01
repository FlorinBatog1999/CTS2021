package ro.ase.cts.adapter.clase;

public class Bilet {
	private float pretBilet;

	public Bilet(float pretBilet) {
		super();
		this.pretBilet = pretBilet;
	}
	public void rezerva() {
		System.out.println("biletul cu pretul "+pretBilet+" a fost rezervat");
	}
	
	public void vinde() {
		System.out.println("biletul cu pretul "+pretBilet+" a fost vandut");
	}
}
