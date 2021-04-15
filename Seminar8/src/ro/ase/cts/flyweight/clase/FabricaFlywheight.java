package ro.ase.cts.flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class FabricaFlywheight {
	private Map<String, FlyWheightAbstract> clienti;

	public FabricaFlywheight() {
		super();
		this.clienti = new HashMap<>();
	}
	public FlyWheightAbstract getClient(String numarTelefon) {
		Client client=(Client) clienti.get(numarTelefon);
		if(client==null) {
			client=new Client("Gigel", numarTelefon, "gigel@gmail.com");
			clienti.put(numarTelefon, client);
		}
		return client;
	}
	



}
