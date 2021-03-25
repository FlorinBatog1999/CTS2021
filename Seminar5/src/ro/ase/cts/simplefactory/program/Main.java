package ro.ase.cts.simplefactory.program;

import ro.ase.cts.simplefactory.clase.Factory;
import ro.ase.cts.simplefactory.clase.Jucator;
import ro.ase.cts.simplefactory.clase.TipJucator;

public class Main {
	public static void main(String args[]) {
		
		try {
			Jucator jucator1=Factory.createJucator(TipJucator.Fundas, "Gigel");
			Jucator jucator2=Factory.createJucator(TipJucator.Portar, "Dorel");
			System.out.println(jucator1.toString());
			System.out.println(jucator2.toString());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
