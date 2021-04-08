package ro.ase.cts.adapter.clase;

public class AdapterBilet implements BiletOnline{

	private Bilet bilet;
	
	
	public AdapterBilet(Bilet bilet) {
		super();
		this.bilet = bilet;
	}

	@Override
	public void rezerva() {
		bilet.rezerva();
		
	}

	@Override
	public void vinde() {
		bilet.vinde();
		
	}

}
