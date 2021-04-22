package ro.ase.cts.strategy.clase;

public class Cash implements ModPlata{

	@Override
	public void achita(float suma) {
		System.out.println("Plata a fost efectuata in numerar");
		
	}

}
