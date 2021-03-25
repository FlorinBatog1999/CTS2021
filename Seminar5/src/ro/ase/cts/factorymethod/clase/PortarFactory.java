package ro.ase.cts.factorymethod.clase;

public class PortarFactory implements Factory{

	@Override
	public Jucator createFactory(String nume) {
		return new Portar(nume);
	}

}
