package ro.ase.cts.composite.clase;

public interface ComponentaMeniu {
	void adaugaNod(ComponentaMeniu componenta) throws Exception;
	void stergereNod(ComponentaMeniu componenta) throws Exception;
	void afiseazaInformatii();
	ComponentaMeniu getComponenta(int index) throws Exception;
}
