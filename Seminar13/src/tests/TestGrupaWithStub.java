package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import clase.Grupa;
import clase.IStudent;
import dubluri.StudentStub;

public class TestGrupaWithStub {
	
	@Test
	public void testGetPromovabilitate() {
		IStudent student=new StudentStub();

		Grupa grupa=new Grupa(1076);
		
		grupa.adaugaStudent(student);
		
		assertEquals(1, grupa.getPromovabilitate(),0.01);
	}
}
