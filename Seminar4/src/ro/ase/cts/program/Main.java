package ro.ase.cts.program;

import ro.ase.cts.clase.ManagerSpital;
import ro.ase.cts.clase.ManagerSpitalLazy;
import ro.ase.cts.clase.Subfiliala;


public class Main {

	public static void main(String[] args) {
		ManagerSpital m1=ManagerSpital.getInstanta();
		ManagerSpital m2=ManagerSpital.getInstanta();

		System.out.println(m1.toString());
		System.out.println(m2.toString());

		ManagerSpitalLazy managerLazy1=ManagerSpitalLazy.getInstanta("Dorel", 45, 1500);
		ManagerSpitalLazy managerLazy2=ManagerSpitalLazy.getInstanta("Viorel", 47, 1700);
	
		managerLazy1.setVarsta(36);
		managerLazy2.setNume("Vasile");
		
		System.out.println(managerLazy1.toString());
		System.out.println(managerLazy2.toString());
		
		System.out.println("------------------------");
		
		Subfiliala subfiliala1=Subfiliala.getInstanta("BT Hunedoara", 10, 2010);
		Subfiliala subfiliala2=Subfiliala.getInstanta("BT Resita", 5, 2015);
		
		subfiliala1.setAnAparitie(2012);
		subfiliala2.setDenumire("BT Ialomita");
		
		System.out.println(subfiliala1.toString());
		System.out.println(subfiliala2.toString());
	}

}
