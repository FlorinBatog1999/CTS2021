package ro.ase.cts.facade.program;

import ro.ase.cts.facade.clase.BazaDeDateHuligani;
import ro.ase.cts.facade.clase.Bilet;
import ro.ase.cts.facade.clase.Facade;
import ro.ase.cts.facade.clase.Persoana;
import ro.ase.cts.facade.clase.Politie;

public class Main {

	public static void main(String[] args) {
		Persoana p1=new Persoana("Gigel","1990315126746");
		Bilet b1= new Bilet("Gigel","Ghencea");
		if(p1.getNume().equals(b1.getNume())) {
			if(Politie.esteCautat(p1)) {
				if(BazaDeDateHuligani.esteInListaDeHuligani(p1)) {
					System.out.println("Puteti intra!");
				}
				else {
					System.out.println("Ne pare rau, nu puteti intra!");
				}
			}
			
		}
		
		Persoana p2=new Persoana("Iulia","2990224180098");
		Bilet b2=new Bilet("Iustin","Ghencea");
		if(Facade.sePermiteAccesulPeStadion(p2, b2)) {
			System.out.println("Puteti intra!");
		}
		else {
			System.out.println("Ne pare rau, nu puteti intra!");
		}
	}

}
