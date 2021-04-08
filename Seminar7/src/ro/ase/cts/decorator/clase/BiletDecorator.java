package ro.ase.cts.decorator.clase;

public class BiletDecorator implements BiletAbstract{
	private String numeGazde;
	private String numeOaspeti;
	private String numeClient;
	
	
	public BiletDecorator(String numeGazde, String numeOaspeti, String numeClient) {
		super();
		this.numeGazde = numeGazde;
		this.numeOaspeti = numeOaspeti;
		this.numeClient = numeClient;
	}


	public String getNumeGazde() {
		return numeGazde;
	}


	public String getNumeOaspeti() {
		return numeOaspeti;
	}


	public String getNumeClient() {
		return numeClient;
	}


	@Override
	public void rezervaBilet() {
		System.out.println(numeClient+" are bilet la meciul "+numeGazde+"-"+numeOaspeti);;
	}

}
