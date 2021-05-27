package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Grupa;

public class TestGrupa {

	@Test
	public void testConstructorRight() {
		Grupa grupa = new Grupa(1076);
		assertEquals(1076, grupa.getNrGrupa());
	}

	@Test
	public void testConstructorBoundaryInf() {
		Grupa grupa = new Grupa(1000);
		assertEquals(1000, grupa.getNrGrupa());

	}

	@Test
	public void testConstructorBoundarySup() {
		Grupa grupa = new Grupa(1100);
		assertEquals(1100, grupa.getNrGrupa());

	}
	@Test(expected = IllegalArgumentException.class)
	public void testConstructortoError() {
		Grupa grupa=new Grupa(1200);
	}
	@Test(expected = IllegalArgumentException.class)
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
	public void testConstructorLista() {
		Grupa grupa=new Grupa(1076);
		assertNotNull(grupa.getStudenti());
	}
	//Time-> acelasi lucru cu Performance din RIGHT-BICEP
	

}
