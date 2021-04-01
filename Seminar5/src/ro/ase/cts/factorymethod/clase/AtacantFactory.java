package ro.ase.cts.factorymethod.clase;

public class AtacantFactory implements Factory{

	@Override
	public Jucator createFactory(String nume) {
		return new Atacant(nume);
	}
	
}
