package ro.ase.cts.decorator.clase;

public class DecoratorCuMesajSarbatori extends DecoratorAbstract{

	public DecoratorCuMesajSarbatori(BiletAbstract biletAbstract) {
		super(biletAbstract);
	}
	@Override
	public void rezervaBilet() {
		super.rezervaBilet();
		System.out.println(" Va uram La multi ani!");
	}
}
