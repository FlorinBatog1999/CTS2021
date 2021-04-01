package ro.ase.cts.builder.clase;

public class RezervareBuilder implements BuilderAbstract{
	private Rezervare rezervare;
	@Override
	public Rezervare build() {
		return rezervare;
	}
	public RezervareBuilder() {
		rezervare=new Rezervare(0, false, false, false, false, "");
		
	}

	public RezervareBuilder setCodRezervare(int codRezervare) {
		rezervare.setCodRezervare(codRezervare);
		return this;
	}
	public RezervareBuilder setAreMancare(boolean areMancare) {
		rezervare.setAreMancare(areMancare);
		return this;
	}
	public RezervareBuilder setAreBautura(boolean areBautura) {
		rezervare.setAreBautura(areBautura);
		return this;
	}
	public RezervareBuilder setAreScaunErgonomic(boolean areScaunErgonomic) {
		rezervare.setAreScaunErgonomic(areScaunErgonomic);;
		return this;
	}
	public RezervareBuilder setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
		rezervare.setAreScaunErgonomic(areMuzicaAmbientala);;
		return this;
	}
	public RezervareBuilder setGenMuzical(String genMuzical) {
		rezervare.setGenMuzical(genMuzical);;
		return this;
	}
}
