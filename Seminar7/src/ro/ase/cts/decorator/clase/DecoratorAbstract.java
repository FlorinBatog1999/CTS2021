package ro.ase.cts.decorator.clase;

//implementam BiletAbstract si avem atribut BiletAbstract 
//pentru a respecta diagrama pentru decorator.
//Intre DecoratorAbstract si BiletAbstract exista relatia de has a
//si o relarie de is a
public class DecoratorAbstract implements BiletAbstract{
	private BiletAbstract biletAbstract;

	public DecoratorAbstract(BiletAbstract biletAbstract) {
		super();
		this.biletAbstract = biletAbstract;
	}

	@Override
	public void rezervaBilet() {
		biletAbstract.rezervaBilet();
	}

	public BiletAbstract getBiletAbstract() {
		return biletAbstract;
	}
	
	
}
