package ro.ase.cts.state.clase;

public class Libera implements State{

	@Override
	public void schimbaStarea(Masa masa) {
		if(!(masa.getStare() instanceof Libera)) {
			System.out.println("Ati eliberat masa cu codul "+masa.getNumar());
			masa.setStare(this);
		}
		else {
			System.out.println("Masa este deja libera");
		}
		
	}

}
