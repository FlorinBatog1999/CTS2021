package ro.ase.cts.clase.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Elev;

public class PupilReader extends Reader {
	//Putem avea utrmatoarea problema: un PupilReader sa citeasca dintr-un fisier in care sunt angajati.
	//Pentru a evita acest lucru, creem un atribut care va reprezenta fisierul din care citim si constructorul clasei Reader.
	//Vom mosteni clasa Reader
	public PupilReader(String fileName) {
		super(fileName);
	}

	public List<Aplicant> readApplicants() throws FileNotFoundException {
		Scanner input2 = new Scanner(new File(super.FileName));
		input2.useDelimiter(",|\n");
		List<Aplicant> elevi = new ArrayList<Aplicant>();

		while (input2.hasNext()) {
			Elev e=new Elev();
			super.readAplicant(input2, e);
			int clasa = input2.nextInt();
			String tutore = input2.next();
			e.setClasa(clasa);
			elevi.add(e);
		}

		input2.close();
		return elevi;
	}

}
