package ro.ase.cts.clase.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Student;

public class StudentReader extends Reader {

	public StudentReader(String fileName) {
		super(fileName);
	}

	public List<Aplicant> readApplicants() throws FileNotFoundException, NumberFormatException {
		Scanner inputAplicanti = new Scanner(new File(super.FileName));
		inputAplicanti.useDelimiter(",|\n");
		List<Aplicant> studenti = new ArrayList<Aplicant>();

		while (inputAplicanti.hasNext()) {
			Student s = new Student();
			super.readAplicant(inputAplicanti, s);
			int anStudii = inputAplicanti.nextInt();
			String facultate = (inputAplicanti.next()).toString();
			s.setAnStudii(anStudii);
			s.setFacultate(facultate);
			studenti.add(s);
		}
		inputAplicanti.close();
		return studenti;
	}
}
