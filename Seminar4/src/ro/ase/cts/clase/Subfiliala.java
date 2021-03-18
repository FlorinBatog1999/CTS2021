package ro.ase.cts.clase;

public class Subfiliala {
	private String denumire;
	private int numarAngajati;
	private int anAparitie;
	
	private static Subfiliala instanta=null;
	
	public static synchronized Subfiliala getInstanta(String denumire, int numarAngajati, int anAparitie) {
		if(instanta==null) {
			instanta=new Subfiliala(denumire, numarAngajati, anAparitie);
		}
		return instanta;
	}
	
	private Subfiliala(String denumire, int numarAngajati, int anAparitie) {
		super();
		this.denumire = denumire;
		this.numarAngajati = numarAngajati;
		this.anAparitie = anAparitie;
	}
	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}
	public void setNumarAngajati(int numarAngajati) {
		this.numarAngajati = numarAngajati;
	}
	public void setAnAparitie(int anAparitie) {
		this.anAparitie = anAparitie;
	}
	@Override
	public String toString() {
		return "Subfiliala [denumire=" + denumire + ", numarAngajati=" + numarAngajati + ", anAparitie=" + anAparitie
				+ "]";
	}
	
	
}
