package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Grupa;
import clase.IStudent;
import dubluri.StudentDummy;

public class TestGrupaWithDummy {
//Avantaj: nu mai aloc resurse pentru numele studentului, numarul de note,etc
	@Test
	public void test() {
		IStudent student=new StudentDummy(); 
		Grupa grupa=new Grupa(1076);
		grupa.adaugaStudent(student);
		assertEquals(1, grupa.getStudenti().size());
	}

}
