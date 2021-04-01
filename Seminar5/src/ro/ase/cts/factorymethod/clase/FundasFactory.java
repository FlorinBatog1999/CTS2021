package ro.ase.cts.factorymethod.clase;

public class FundasFactory implements Factory{

	@Override
	public Jucator createFactory(String nume) {
		return new Fundas(nume);
	}

}
