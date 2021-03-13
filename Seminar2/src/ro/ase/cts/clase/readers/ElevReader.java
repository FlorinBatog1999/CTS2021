package ro.ase.cts.clase.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Elev;

public class ElevReader extends Reader {
	public ElevReader(String fileName) {
		super(fileName);
	}

	public List<Aplicant> readApplicants() throws FileNotFoundException {
		Scanner inputAplicanti = new Scanner(new File(super.FileName));
		inputAplicanti.useDelimiter(",|\n");
		List<Aplicant> elevi = new ArrayList<Aplicant>();

		while (inputAplicanti.hasNext()) {
			Elev e = new Elev();
			super.readAplicant(inputAplicanti, e);
			int clasa = inputAplicanti.nextInt();
			String tutore = inputAplicanti.next();
			e.setClasa(clasa);
			e.setTutore(tutore);
			elevi.add(e);
		}

		inputAplicanti.close();
		return elevi;
	}

}
