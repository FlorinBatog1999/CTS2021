package ro.ase.cts.decorator.program;

import ro.ase.cts.decorator.clase.BiletDecorator;
import ro.ase.cts.decorator.clase.DecoratorAbstract;
import ro.ase.cts.decorator.clase.DecoratorCuMesajSarbatori;
import ro.ase.cts.decorator.clase.DecoratorCuMesajSustinere;


public class Main {

	public static void main(String[] args) {
		BiletDecorator bilet=new BiletDecorator("FCSB","CFR","Gigel");
		bilet.rezervaBilet();
		DecoratorCuMesajSustinere decorator1=new DecoratorCuMesajSustinere(bilet);
		decorator1.rezervaBilet();
		
		DecoratorCuMesajSarbatori decorator2= new DecoratorCuMesajSarbatori(bilet);
		System.out.println();
		decorator2.rezervaBilet();
		
		DecoratorAbstract decorator3=new DecoratorCuMesajSarbatori(decorator1);
		decorator3.rezervaBilet();
	}

}
