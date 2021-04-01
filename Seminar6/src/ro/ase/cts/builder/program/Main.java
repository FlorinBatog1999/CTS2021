package ro.ase.cts.builder.program;

import ro.ase.cts.builder.clase.Rezervare;
import ro.ase.cts.builder.clase.RezervareBuilder;

public class Main {
	public static void main(String[] args) {
		RezervareBuilder rezervareBuilder=new RezervareBuilder();
		Rezervare rezervare1=rezervareBuilder.setAreBautura(true).setAreScaunErgonomic(true).build();
		Rezervare rezervare2=new RezervareBuilder().setAreMuzicaAmbientala(true).setGenMuzical("rap").build();
		
		//Avem shallow copy pentru ca setam aceeasi referint in memorie, si anume rezervare
		//Pentru a doua rezervare, trebuie sa creem un nou RezervareBuilder.
		
		System.out.println(rezervare1.toString());
		System.out.println(rezervare2.toString());
	
	}
}
