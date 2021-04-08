package ro.ase.cts.builderv2.program;

import ro.ase.cts.builderv2.clase.Rezervare2;
import ro.ase.cts.builderv2.clase.RezervareBuilderv2;

public class Main {

	public static void main(String[] args) {
		RezervareBuilderv2 r=new RezervareBuilderv2();
		Rezervare2 rezervareV1=r.setAreScaunErgonomic(true).build();
		Rezervare2 rezervareV2=r.setAreBautura(true).build();
		System.out.println(rezervareV1);
		System.out.println(rezervareV2);

	}

}
