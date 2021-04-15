package ro.ase.cts.proxy.clase;

public class Proxy implements IOperatorRezervare{
	private OperatorRezervare operatorRezervare;
	private int nrMinimPersoane;
	
	public Proxy(OperatorRezervare operatorRezervare, int nrMinimPersoane) {
		super();
		this.operatorRezervare = operatorRezervare;
		this.nrMinimPersoane=nrMinimPersoane;
	}

	@Override
	public void rezervare(int nrPersoane) {
		if(nrPersoane>nrMinimPersoane) {
			operatorRezervare.rezervare(nrPersoane);
		}
		else {
			System.out.println("Nu s-a putut realiza rezervarea.");
		}
	}

}
