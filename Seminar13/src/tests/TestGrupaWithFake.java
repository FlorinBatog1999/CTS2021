package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import clase.Grupa;
import dubluri.StudentFake;

public class TestGrupaWithFake {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testPromovabilitateRight() {
		Grupa grupa=new Grupa(1076);
		for(int i=0;i<8;i++) {
			StudentFake student=new StudentFake();
			student.setValoareAreRestante(false);
			grupa.adaugaStudent(student);
		}
		
		for(int i=0;i<2;i++) {
			StudentFake student=new StudentFake();
			student.setValoareAreRestante(true);
			grupa.adaugaStudent(student);
			
		}
		assertEquals(0.8, grupa.getPromovabilitate(),0.01);
		
	}

}
