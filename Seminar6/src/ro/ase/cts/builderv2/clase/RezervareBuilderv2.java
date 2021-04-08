package ro.ase.cts.builderv2.clase;

public class RezervareBuilderv2 implements BuilderAbstract{
	//private Rezervare rezervare;
	//pentru versiunea 2 nu se mai foloseste o instanta a clasei Rezervare
	private int codRezervare;
	private boolean areMancare;
	private boolean areBautura;
	private boolean areScaunErgonomic;
	private boolean areMuzicaAmbientala;
	private String genMuzical;
	public RezervareBuilderv2() {
		this.codRezervare = 0;
		this.areMancare = false;
		this.areBautura = false;
		this.areScaunErgonomic = false;
		this.areMuzicaAmbientala = false;
		this.genMuzical = "rock";
	}


	public RezervareBuilderv2 setCodRezervare(int codRezervare) {
		this.codRezervare=codRezervare;
		return this;
	}
	public RezervareBuilderv2 setAreMancare(boolean areMancare) {
		this.areMancare=areMancare;
		return this;
	}
	public RezervareBuilderv2 setAreBautura(boolean areBautura) {
		this.areBautura=areBautura;
		return this;
	}
	public RezervareBuilderv2 setAreScaunErgonomic(boolean areScaunErgonomic) {
		this.areScaunErgonomic=areScaunErgonomic;
		return this;
	}
	public RezervareBuilderv2 setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
		this.areMuzicaAmbientala=areMuzicaAmbientala;
		return this;
	}
	public RezervareBuilderv2 setGenMuzical(String genMuzical) {
		this.genMuzical=genMuzical;
		return this;
	}


	@Override
	public Rezervare2 build() {
		return new Rezervare2(codRezervare, areMancare, areBautura, areScaunErgonomic, areMuzicaAmbientala, genMuzical);
	}
}
