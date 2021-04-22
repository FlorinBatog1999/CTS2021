package ro.ase.cts.state.clase;

public class Ocupata implements State{

	@Override
	public void schimbaStarea(Masa masa) {
		if(!(masa.getStare() instanceof Ocupata) ) {
			System.out.println("Ati ocupat masa cu codul "+masa.getNumar());
			masa.setStare(this);
		}
		else {
			System.out.println("Masa este deja rezervata!");
		}
		
	}

}
