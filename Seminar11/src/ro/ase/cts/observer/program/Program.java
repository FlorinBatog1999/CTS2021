package ro.ase.cts.observer.program;

import ro.ase.cts.observer.clase.Client;
import ro.ase.cts.observer.clase.ManagerSala;
import ro.ase.cts.observer.clase.TipMeci;


public class Program {

	public static void main(String[] args) {
		try {
			ManagerSala managerSala=new ManagerSala();
			Client client1=new Client("Gigel");
			Client client2=new Client("Marcel");
			Client client3=new Client("Ionel");
			
			managerSala.adaugaObserver(client1);
			managerSala.adaugaObserver(client2);
			managerSala.adaugaObserver(client3);
			managerSala.anuntaMeci(TipMeci.Fotbal);
			managerSala.stergeObserver(client3);
			managerSala.anuntaMeci(TipMeci.Handbal);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	
		
		
	}

}
