package ro.ase.cts.observer.program;

import ro.ase.cts.observer.clase.Client;
import ro.ase.cts.observer.clase.ManagerSala;


public class Program {

	public static void main(String[] args) {
		ManagerSala managerSala=new ManagerSala();
		Client client1=new Client("Gigel");
		Client client2=new Client("Marcel");
		Client client3=new Client("Ionel");
		
		managerSala.adaugaObserver(client1);
		managerSala.adaugaObserver(client2);
		managerSala.adaugaObserver(client3);
		
		managerSala.anuntaMeciFotbal();
		
		managerSala.stergeObserver(client3);
		
		managerSala.anuntaMeciFotbal();
	}

}
