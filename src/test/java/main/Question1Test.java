package main;

import static org.junit.Assert.*;
import org.junit.Test;

public class Question1Test {
	Courses courses;
	@SuppressWarnings("static-access")
	@Test
	public void testEce() {
		//new ECE();
		assertEquals("You have chosen ECE department.\nThe common subjects are:\n1. Engineering Mathematics\n2. Physics\n3. Chemistry\nECE specific subjects are:\n4. Microprocessor\n5. Linear Integrated Circuits",new ECE().displayCourseDetails("ECE"));
	}
	@SuppressWarnings("static-access")
	@Test
	public void testMech() {
		//Courses mech=new Mechanical();
		assertEquals("You have chosen Mechanical department.\nThe common subjects are:\n1. Engineering Mathematics\n2. Physics\n3. Chemistry\nMechanical specific subjects are:\n4. Fluid Mechanics\n5. Thermodynamics",new Mechanical().displayCourseDetails("Mechanical"));
	}
	@SuppressWarnings("static-access")
	@Test
	public void testCse() {
		//Courses cse=new CSE();
		assertEquals("You have chosen CSE department.\nThe common subjects are:\n1. Engineering Mathematics\n2. Physics\n3. Chemistry\nCSE specific subjects are:\n4. Network Theory\n5. Operating Systems",new CSE().displayCourseDetails("CSE"));
	}
}
