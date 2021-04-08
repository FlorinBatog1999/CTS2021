package ro.ase.cts.decorator.clase;

import ro.ase.cts.facade.clase.Bilet;

public class DecoratorCuMesajSustinere extends DecoratorAbstract{
 public DecoratorCuMesajSustinere(BiletAbstract biletAbstract) {
	 super(biletAbstract);
 }
@Override
public void rezervaBilet() {
	super.rezervaBilet();
	System.out.println("Sustinem echipa "+((BiletDecorator)(super.getBiletAbstract())).getNumeGazde());;
}
 
}
