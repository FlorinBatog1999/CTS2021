package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Student;

public class StudentTests {

	@Test
	public void testConstructorCuParametru() {
		String nume="Gigel";
		Student student=new Student(nume);		
		assertEquals(nume, student.getNume());
// 		ce e in spatele lui assert
//		if(nume!=student.getNume()) {
//		fail("Numele nu este corect");
//	}
	
	}
	@Test
	public void testFaraParametrii() {
	
		Student student=new Student();
		assertEquals("Student", student.getNume());
	}
	@Test
	public void testAdaugareNota() {
		Student student=new Student();
		student.adaugaNota(10);
		assertEquals(1,student.getNote().size());
	}
	@Test
	public void testNotaAdaugataCorecta() {
		int nota=10;
		Student student=new Student();
		student.adaugaNota(nota);
		assertEquals(nota, student.getNota(0));
	}
	@Test
	public void testNotaIncorecta() {
		int nota=15;
		Student student=new Student();
		try {
			student.adaugaNota(nota);
			fail("Nu trebuia sa ajunga aici. Metoda trebuia sa arunce o exceptie");
		}catch(IllegalArgumentException e) {
			
		}
	}
	@Test(expected = IllegalArgumentException.class)
	public void testNotaIncorectaJUnit() {
		int nota=15;
		Student student=new Student();
		student.adaugaNota(nota);
	}
	@Test
	public void calculeazaMedieFaraNote() {
		Student student=new Student();
		assertEquals(0, student.calculeazaMedie(),0.01);
	}
	@Test
	public void calculeazaMedieONota() {
		int numar=8;
		Student student=new Student();
		student.adaugaNota(numar);
		assertEquals(numar, student.calculeazaMedie(),0.01);
	}
	@Test
	public void testCalculeazaMedie() {
		Student student=new Student();
		student.adaugaNota(10);
		student.adaugaNota(5);
		student.adaugaNota(7);
		assertEquals(7.3, student.calculeazaMedie(),0.05);
	}

	@Test
	public void testAreRestanta() {
		Student student=new Student();
		student.adaugaNota(10);
		student.adaugaNota(4);
		assertTrue("Studentul care are restanta este marcat ca neavand restanta",student.areRestante());
	}
	@Test
	public void testNuAreRestanta() {
		Student student=new Student();
		student.adaugaNota(10);
		student.adaugaNota(7);
		assertFalse("Studentul care nu are restanta este marcat ca avand restanta",student.areRestante());
	}
}
