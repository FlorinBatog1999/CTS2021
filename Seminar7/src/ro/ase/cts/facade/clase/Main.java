package ro.ase.cts.facade.clase;

public class Main {

	public static void main(String[] args) {
		Persoana p1=new Persoana("Gigel","1990315126745");
		Bilet b1= new Bilet("Gigel","Ghencea");
		if(p1.getNume().equals(b1.getNume())) {
			if(Politie.esteCautat(p1)) {
				if(BazaDeDateHuligani.esteInListaDeHuligani(p1)) {
					System.out.println("Puteti intra");
				}
			}
			
		}
		
		Persoana p2=new Persoana("Iulia","2990224180098");
		Bilet b2=new Bilet("Iustin","Ghencea");
		if(Facade.sePermiteAccesulPeStadion(p2, b2)) {
			System.out.println("Puteti intra");
		}
		else {
			System.out.println("Ne pare rau, nu puteti intra!");
		}
	}

}
