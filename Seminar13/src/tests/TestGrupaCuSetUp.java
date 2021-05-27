package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import clase.Grupa;
import clase.Student;

//Daca am fi pastrat setUp() cream cei 35 de studenti pe care nu-i foloseam
//in testele noastre din TestGrupa
public class TestGrupaCuSetUp {
	Grupa grupa;
	@Before
	public void setUp() throws Exception{
		grupa=new Grupa(1076); 
		for(int i=0;i<35;i++) {
			Student student=new Student("Gigel");
			student.adaugaNota(10);
			student.adaugaNota(9);
			student.adaugaNota(8);
			student.adaugaNota(7);
			student.adaugaNota(6);
			student.adaugaNota(5);
			student.adaugaNota(5);
			student.adaugaNota(5);
			grupa.adaugaStudent(student);
		}
	}
	//Performance
	@Test(timeout=500)
	public void testPromovabilitatePerformance(){
		grupa.getPromovabilitate();	
	}

}
