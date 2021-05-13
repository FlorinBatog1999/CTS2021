package ro.ase.cts.template.clase;

public abstract class TemplateModIntrare {
	public abstract void asezareLaCoada();
	public abstract void prezintaBiletul();
	public abstract void controlCorporal();
	public abstract void ocupaLoc();
	
	public final void intrarePeStadion() {
		asezareLaCoada();
		prezintaBiletul();
		controlCorporal();
		ocupaLoc();
	}
}
