package ro.ase.cts.memento.program;

import ro.ase.cts.memento.clase.ManagerMemento;
import ro.ase.cts.memento.clase.Meci;
import ro.ase.cts.memento.clase.Memento;

public class Program {

	public static void main(String[] args) {
		Meci meci=new Meci("Steaua", "Dinamo", 500, 600, 500, 100);
		Memento memento=new Memento("Steaua", "Dinamo", 500);
		ManagerMemento manager=new ManagerMemento();
		manager.adaugaMemento(meci.creareMemento());
		
		System.out.println(meci.toString());
		
		meci.revenire(memento);
		System.out.println(meci.toString());
		
	}

}
