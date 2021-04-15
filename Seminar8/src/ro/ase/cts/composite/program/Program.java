package ro.ase.cts.composite.program;

import ro.ase.cts.composite.clase.ComponentaMeniu;
import ro.ase.cts.composite.clase.Item;
import ro.ase.cts.composite.clase.Sectiune;

public class Program {

	public static void main(String[] args) throws Exception {

		ComponentaMeniu meniu=new Sectiune("Meniu");
		
		ComponentaMeniu sectiuneBauturi=new Sectiune("bauturi");
		ComponentaMeniu sectiuneDesert=new Sectiune("Desert");
		
		ComponentaMeniu frappe=new Item("Frappe");
		ComponentaMeniu clatite=new Item("Clatite");
		ComponentaMeniu cola=new Item("Cola");
		
		meniu.adaugaNod(sectiuneDesert);
		meniu.adaugaNod(sectiuneBauturi);
		
		sectiuneBauturi.adaugaNod(frappe);
		sectiuneBauturi.adaugaNod(cola);
		sectiuneDesert.adaugaNod(clatite);
		
		meniu.afiseazaInformatii();
		
		
		

	}

}