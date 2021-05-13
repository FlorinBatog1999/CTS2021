package ro.ase.cts.template.program;

import ro.ase.cts.template.clase.SpectatorUzual;
import ro.ase.cts.template.clase.TemplateModIntrare;

public class Program {
	public static void main(String args[]) {
		TemplateModIntrare spectatorUzual=new SpectatorUzual("Marcel");
		spectatorUzual.intrarePeStadion();
		
		TemplateModIntrare spectatorCuHandicap=new SpectatorUzual("Virgil");
		spectatorCuHandicap.intrarePeStadion();
	}
}
