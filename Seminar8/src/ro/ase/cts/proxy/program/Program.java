package ro.ase.cts.proxy.program;

import ro.ase.cts.proxy.clase.Proxy;

import ro.ase.cts.proxy.clase.OperatorRezervare;

public class Program {

	public static void main(String[] args) {
		OperatorRezervare operator1=new OperatorRezervare("Sinaia");
		operator1.rezervare(5);
		Proxy proxy=new Proxy(operator1, 4);
		proxy.rezervare(9);
		proxy.rezervare(3);
	}

}
