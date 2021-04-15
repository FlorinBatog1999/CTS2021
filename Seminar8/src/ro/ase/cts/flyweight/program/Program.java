package ro.ase.cts.flyweight.program;

import ro.ase.cts.flyweight.clase.Client;
import ro.ase.cts.flyweight.clase.FabricaFlywheight;
import ro.ase.cts.flyweight.clase.Rezervare;

public class Program {

	public static void main(String[] args) {
		Rezervare rezervare1=new Rezervare(3, 4, 10);
		Rezervare rezervare2=new Rezervare(4, 5, 12);
		Rezervare rezervare3=new Rezervare(5, 6, 14);
		//Obtinem clienti din fabrica flyweight
		FabricaFlywheight factory=new FabricaFlywheight();
		Client client=(Client) factory.getClient("0700654556");
		client.afiseazaInformatii(rezervare1);
		Client client2=(Client) factory.getClient("0236565777");
		client2.afiseazaInformatii(rezervare2);
		
	
	}

}
