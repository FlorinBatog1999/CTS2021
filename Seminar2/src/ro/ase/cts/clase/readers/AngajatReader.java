package ro.ase.cts.clase.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;

public class AngajatReader extends Reader {

	public AngajatReader(String fileName) {
		super(fileName);
	}

	public List<Aplicant> readApplicants() throws FileNotFoundException {
		Scanner inputAplicanti = new Scanner(new File(super.FileName));
		inputAplicanti.useDelimiter(",");
		List<Aplicant> angajati = new ArrayList<Aplicant>();

		while (inputAplicanti.hasNext()) {
			Angajat a = new Angajat();
			super.readAplicant(inputAplicanti, a);
			int salariu = inputAplicanti.nextInt();
			String ocupatie = inputAplicanti.next();
			a.setSalariu(salariu);
			a.setOcupatie(ocupatie);
			angajati.add(a);
		}
		inputAplicanti.close();
		return angajati;
	}

}
