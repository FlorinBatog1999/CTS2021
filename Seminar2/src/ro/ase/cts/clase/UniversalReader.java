package ro.ase.cts.clase;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import ro.ase.cts.clase.readers.Reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UniversalReader {
	//TODO punct de legatura catre readere
	//metoda trebuie aplicata prin intermediul unui obiect
	
	public static List<Aplicant> readAplicant(Reader reader) throws FileNotFoundException{
		//adaugam un nivel abstract printr-o clasa abstracta
		return reader.readApplicants();
	}
}
