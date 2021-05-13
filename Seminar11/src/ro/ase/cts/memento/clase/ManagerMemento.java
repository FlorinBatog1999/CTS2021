package ro.ase.cts.memento.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerMemento {
	private List<Memento> listaMemento;
	
	
	public ManagerMemento() {
		super();
		this.listaMemento = new ArrayList<>();
	}

	public void adaugaMemento(Memento memento) {
		
		listaMemento.add(memento);
	}
	
	public Memento getMemento(int index) {
		if(listaMemento.size()>0 && index>=0) {
			listaMemento.get(index);
		}
		return null;
			
	}
}
