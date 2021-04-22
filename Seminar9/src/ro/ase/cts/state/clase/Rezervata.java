package ro.ase.cts.state.clase;

public class Rezervata implements State{

	@Override
	public void schimbaStarea(Masa masa) {
		if(masa.getStare() instanceof Libera ) {
			System.out.println("Ati rezervat masa cu codul "+masa.getNumar());
			masa.setStare(this);
		}
		else {
			System.out.println("Masa nu poate fi rezervata");
		}
		
	}

}
