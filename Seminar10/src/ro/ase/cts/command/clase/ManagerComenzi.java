package ro.ase.cts.command.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerComenzi {
	private List<Command> comenzi;

	public ManagerComenzi() {
		super();
		this.comenzi = new ArrayList<>();
	}
	
	//Daca clasa ManagerComenzi este indisponibila, vom adauga in lista de comenzi folosind metoda invoca,
	//avand ca parametru comanda pe care o introducem in lista
	public void invoca(Command comanda) {
		comenzi.add(comanda);
	}
	
	
	//in lista, ultimul element este pus la sfarsit. Noi vrem sa luam primul element din lista pentru
	//a-l executa, dupa care il stergem din lista
	public void executaComanda() {
		if(comenzi.size()>0) {
			comenzi.get(0).executa();
			comenzi.remove(0);
		}
	}
	
}
