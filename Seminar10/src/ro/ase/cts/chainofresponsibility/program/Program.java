package ro.ase.cts.chainofresponsibility.program;

import ro.ase.cts.chainofresponsibility.clase.Cont;
import ro.ase.cts.chainofresponsibility.clase.ContCurent;
import ro.ase.cts.chainofresponsibility.clase.ContDeCredit;
import ro.ase.cts.chainofresponsibility.clase.ContEconomii;
import ro.ase.cts.chainofresponsibility.clase.ContIndisponibil;

public class Program {

	public static void main(String[] args) {
		Cont cont1=new ContCurent("Andrei", 100);
		Cont cont2=new ContEconomii("Andrei", 200);
		Cont cont3=new ContDeCredit("Andrei", 500);
		Cont cont4=new ContIndisponibil("Andrei");
		
		cont1.setSuccesor(cont2);
		cont2.setSuccesor(cont3);
		cont3.setSuccesor(cont4);
		
		cont1.realizarePlata(60);
		cont1.realizarePlata(300);
		cont1.realizarePlata(600);
	}

}
