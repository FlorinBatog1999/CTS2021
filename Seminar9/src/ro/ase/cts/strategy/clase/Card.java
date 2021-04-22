package ro.ase.cts.strategy.clase;

public class Card implements ModPlata{
	private float sold;
	
	
	public Card(float sold) {
		super();
		this.sold = sold;
	}


	@Override
	public void achita(float suma) {
		if(suma<=sold) {
			System.out.println("S-a platit cu CARDUL");
			sold-=suma;
		}
		else {
			System.out.println("Nu s-a putut efectua plata!");
		}
	}

}
