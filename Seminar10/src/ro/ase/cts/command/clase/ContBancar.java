package ro.ase.cts.command.clase;

public class ContBancar {
	private String denumire;
	private float sold;
	
	public ContBancar(String denumire) {
		super();
		this.denumire = denumire;
	}
	
	public void constituire(float suma) {
		System.out.println("Contul a fost constitui cu suma de "+suma);
	}
	
	public void retragere(float suma) {
		if(suma>sold) {
			sold-=suma;
			System.out.println("A fost retrasa suma de "+suma+" lei din cont");
		}
		else {
			System.out.println("Sold insuficient!");
		}
	}
	
	public void depunere(float suma) {
		sold+=suma;
		System.out.println("A fost depusa suma de "+suma);
	}
}
