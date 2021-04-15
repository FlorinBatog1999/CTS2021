package ro.ase.cts.composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements ComponentaMeniu{
	private String numeSectiune;
	private List<ComponentaMeniu> lista;
	
	
	public Sectiune(String numeSectiune) {
		super();
		this.numeSectiune = numeSectiune;
		this.lista=new ArrayList<ComponentaMeniu>();
	}
	@Override
	public void adaugaNod(ComponentaMeniu componenta) {
		lista.add(componenta);
	}
	@Override
	public void stergereNod(ComponentaMeniu componenta) {
		lista.remove(componenta);
		
	}
	@Override
	public void afiseazaInformatii() {
		System.out.println("Sectiune "+numeSectiune);
	}
	@Override
	public ComponentaMeniu getComponenta(int index) {
		if(index>=0 && index<lista.size()) {
			return lista.get(index);
		}
		else throw new RuntimeException("Nu exista");
	}
}
