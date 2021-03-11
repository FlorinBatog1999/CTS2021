package ro.ase.cts.clase.readers;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Aplicant;
//clasa abstracta Reader permite citirea din fisier a unui elev, student sau angajat in functie de clasele StudentReader,
//PupilReader, AngajatReader. 
public abstract class Reader {
	
	protected String FileName;

	public Reader(String fileName) {
		super();
		this.FileName = fileName;
	}
	
	public abstract List<Aplicant> readApplicants() throws FileNotFoundException;

	//nu e nevoie sa 
	public void readAplicant(Scanner input, Aplicant aplicant) {
		String nume = input.next();
		String prenume = (input.next()).toString();
		int varsta = Integer.valueOf(input.nextInt());
		int punctaj = Integer.valueOf(input.nextInt());
		int nr = Integer.valueOf(input.nextInt());
		String[] vect = new String[nr];
		for (int i = 0; i < nr; i++)
			vect[i] = input.next();
		aplicant.setNume(nume);
		aplicant.setPrenume(prenume);
		aplicant.setVarsta(varsta);
		aplicant.setPunctaj(punctaj);
		aplicant.DenumiriProiecte(nr, vect);
		
		
	}
}
