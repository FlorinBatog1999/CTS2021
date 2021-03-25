package ro.ase.cts.factorymethod.clase;

public class MijlocasFactory implements Factory{

	@Override
	public Jucator createFactory(String nume) {
		return new Mijlocas(nume);
	}

}
