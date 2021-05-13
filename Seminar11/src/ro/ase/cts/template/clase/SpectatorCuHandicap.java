package ro.ase.cts.template.clase;

public class SpectatorCuHandicap extends TemplateModIntrare{
	private String nume;
	
	
	
	public SpectatorCuHandicap(String nume) {
		super();
		this.nume = nume;
	}


	@Override
	public void asezareLaCoada() {
		System.out.println("Spectatorul "+nume+" s-a aseazat la coada");
		
	}

	@Override
	public void prezintaBiletul() {
		System.out.println("Spectatorul "+nume+" a prezentat biletul");		
	}

	@Override
	public void controlCorporal() {
		System.out.println("Spectatorul "+nume+" a fost controlat corporal. Se verifica si caruciorul");		
	}

	@Override
	public void ocupaLoc() {
		System.out.println("Spectatorul "+nume+" si-a ocupat locul");
		
	}

}
