package ro.ase.cts.clase.readers;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Aplicant;

public abstract class Reader {
	
	protected String FileName;

	public Reader(String fileName) {
		super();
		this.FileName = fileName;
	}
	
	public abstract List<Aplicant> readApplicants() throws FileNotFoundException;

}
