package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import clase.Grupa;
import clase.Student;
import testscategorii.TesteGetPromovabilitate;
import testscategorii.TesteUrgente;

public class TestGrupa {

	@Test
	@Category(TesteUrgente.class)
	public void testConstructorRight() {
		Grupa grupa = new Grupa(1076);
		assertEquals(1076, grupa.getNrGrupa());
	}

	@Test
	@Category(TesteUrgente.class)
	public void testConstructorBoundaryInf() {
		Grupa grupa = new Grupa(1000);
		assertEquals(1000, grupa.getNrGrupa());

	}

	@Test
	@Category(TesteUrgente.class)
	public void testConstructorBoundarySup() {
		Grupa grupa = new Grupa(1100);
		assertEquals(1100, grupa.getNrGrupa());

	}
	@Test(expected = IllegalArgumentException.class)
	@Category(TesteUrgente.class)
	public void testConstructortoError() {
		Grupa grupa=new Grupa(1200);
	}
	@Test(expected = IllegalArgumentException.class)
	@Category(TesteUrgente.class)
	public void testConstructortoErrorSub1000() {
		Grupa grupa=new Grupa(900);
	}
	@Test(timeout=700)
	public void testPerformance() {
		Grupa grupa=new Grupa(1000);
	}
	//CORRECT
	//Range
	//test in interiorul intervalului-> primul test
	//test pe limitele intervalului-> boundary inf si sup
	//test in afara intervalului-> exception error
	
	//Exist
	@Test
	@Category(TesteUrgente.class)
	public void testConstructorLista() {
		Grupa grupa=new Grupa(1076);
		assertNotNull(grupa.getStudenti());
	}
	//Time-> acelasi lucru cu Performance din RIGHT-BICEP
	@Test
	@Category(TesteGetPromovabilitate.class)
	public void testPromovabilitate() {
		Grupa grupa=new Grupa(1078);
		for(int i=0;i<7;i++) {
			Student student=new Student("Valentin");
			student.adaugaNota(4);
			student.adaugaNota(3);
			student.adaugaNota(2);
			grupa.adaugaStudent(student);
		}
		for(int i=0;i<5;i++) {
			Student student=new Student("Ana");
			student.adaugaNota(7);
			student.adaugaNota(8);
			student.adaugaNota(10);
			grupa.adaugaStudent(student);
		}
		assertEquals(0.41, grupa.getPromovabilitate(),0.02);
	}
	
	@Test
	@Category({TesteGetPromovabilitate.class,TesteUrgente.class})
	public void testPromovabilitateBoundaryInf() {
		Grupa grupa=new Grupa(1076);
		for(int i=0;i<5;i++) {
			Student student=new Student("Ana");
			student.adaugaNota(3);
			student.adaugaNota(5);
			student.adaugaNota(4);
			grupa.adaugaStudent(student);
		}
		assertEquals(0,grupa.getPromovabilitate(),0.01);
	}
	//Right
	@Test
	@Category({TesteGetPromovabilitate.class,TesteUrgente.class})
	public void testPromovabilitateBoundarySup() {
		Grupa grupa=new Grupa(1076);
		for(int i=0;i<5;i++) {
			Student student=new Student("Ana");
			student.adaugaNota(7);
			student.adaugaNota(8);
			student.adaugaNota(10);
			grupa.adaugaStudent(student);
		}
		assertEquals(1,grupa.getPromovabilitate(),0.01);
	}
	//Boundary
	//Inverse relation
	//Cross-check
	//Error
	@Category(TesteGetPromovabilitate.class)
	@Test(expected=IllegalArgumentException.class)
	public void testPromovabilitateListaGoala() {
		Grupa grupa=new Grupa(1077);
		grupa.getPromovabilitate();
	}
	

}
