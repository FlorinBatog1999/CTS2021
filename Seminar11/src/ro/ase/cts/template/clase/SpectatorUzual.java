package ro.ase.cts.template.clase;

public class SpectatorUzual extends TemplateModIntrare{
	private String nume;
	
	
	public SpectatorUzual(String nume) {
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
		System.out.println("Spectatorul "+nume+" a fost controlat");
		
	}

	@Override
	public void ocupaLoc() {
		System.out.println("Spectatorul "+nume+" si-a ocupat locul");
		
	}
	
}
