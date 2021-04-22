package ro.ase.cts.strategy.program;

import ro.ase.cts.strategy.clase.Card;
import ro.ase.cts.strategy.clase.Cash;
import ro.ase.cts.strategy.clase.Client;

public class Main {

	public static void main(String[] args) {
		Card card=new Card(300);
		Client client=new Client("Gigel", card);
		
		client.plata(400);
		client.setModPlata(new Cash());
		client.plata(200);
	}

}
