package ro.ase.cts.observer.clase;

public class Client implements IObserver{
	private String nume;
	
	
	
	public Client(String nume) {
		super();
		this.nume = nume;
	}



	@Override
	public void notifica(String mesaj) {
		System.out.println("Clientul "+nume+" a primit notificarea: "+mesaj);
		
	}

}
