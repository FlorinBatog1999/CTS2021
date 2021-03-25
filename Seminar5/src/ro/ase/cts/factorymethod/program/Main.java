package ro.ase.cts.factorymethod.program;

import ro.ase.cts.factorymethod.clase.Factory;
import ro.ase.cts.factorymethod.clase.FundasFactory;
import ro.ase.cts.factorymethod.clase.Jucator;
import ro.ase.cts.factorymethod.clase.MijlocasFactory;
import ro.ase.cts.factorymethod.clase.PortarFactory;

public class Main {

	public static void printeazaJucator(Factory fabrica, String nume) {
		Jucator jucator=fabrica.createFactory(nume);
		System.out.println(jucator.toString());
	}
	public static void main(String[] args) {
		printeazaJucator(new PortarFactory(), "Gigel");
		printeazaJucator(new FundasFactory(), "Dorel");
		printeazaJucator(new MijlocasFactory(), "Marcel");
	}

}
