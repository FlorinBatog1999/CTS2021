package ro.ase.cts.observer.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class Subiect {
	private List<IObserver> observeri;

	public Subiect() {
		super();
		this.observeri = new ArrayList<>();
	}
	
	public void adaugaObserver(IObserver observer) {
		observeri.add(observer);
	}
	public void stergeObserver(IObserver observer) {
		observeri.remove(observer);
	}
	
	public void notificaObserveri(String mesaj) {
		for(IObserver observer : observeri) {
			observer.notifica(mesaj);
		}
	}
}
