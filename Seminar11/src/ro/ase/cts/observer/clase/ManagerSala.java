package ro.ase.cts.observer.clase;

public class ManagerSala extends Subiect{
	//Folosim enum pentru a nu incalca principiul DRY
	public void anuntaMeci(TipMeci tipMeci) throws Exception {
		switch(tipMeci) {
		case Fotbal:
			super.notificaObserveri("A fost programat un meci de fotbal");
			break;
		case Volei:
			super.notificaObserveri("A fost programat un meci de volei");
			break;
		case Handbal:
			super.notificaObserveri("A fost programat un meci de handbal");
			break;
		default:
			throw new Exception("Nu exista un astfel de meci programat");
		}
		
	}

}
