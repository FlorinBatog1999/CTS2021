package ro.ase.cts.adapter.clase;

public class Adapter extends Bilet implements BiletOnline{

	public Adapter(float pretBilet) {
		super(pretBilet);
	}
	@Override
	public void rezerva() {
		super.rezerva();
		
	}

	@Override
	public void vinde() {
		super.vinde();
	}
	

}
