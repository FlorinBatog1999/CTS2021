package ro.ase.cts.command.program;

import ro.ase.cts.command.clase.ComandaConstituire;
import ro.ase.cts.command.clase.ComandaDepunere;
import ro.ase.cts.command.clase.ComandaRetragere;
import ro.ase.cts.command.clase.ContBancar;
import ro.ase.cts.command.clase.ManagerComenzi;

public class OperatorBancar {

	public static void main(String[] args) {
		ContBancar cont=new ContBancar("Marcel");
		ManagerComenzi managerComenzi=new ManagerComenzi();
		managerComenzi.invoca(new ComandaConstituire(cont, 100));
		managerComenzi.invoca(new ComandaDepunere(cont, 50));
		managerComenzi.executaComanda();
		managerComenzi.invoca(new ComandaRetragere(cont, 20));
		managerComenzi.executaComanda();
		managerComenzi.executaComanda();
	}

}
