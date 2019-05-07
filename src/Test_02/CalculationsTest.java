package Test_02;

import static org.junit.jupiter.api.Assertions.*;

//if you want to ignore a test by using @Ignore annotation you have to import org.junit.Ignore
//import org.junit.Ignore;

import org.junit.jupiter.api.Test;

class CalculationsTest {
	
	Calculations cal = new Calculations();
	
	
	//Test Addition without using Assertions
	@Test
	void test1() {
		
		if(cal.add(5,10) != 15 ) {
			fail("Addition Test Failed.");
		}
		else if(cal.add(-1, 1)!= 0) {
			fail("Addition Test Failed.");
		}
		else if(cal.add(-2, -3)!= -5) {
			fail("Addition Test Failed.");
		}
	}
	
	
	//Test Addition using Assertions
	@Test
	void test2() {
		
		assertEquals(15,cal.add(5, 10));
		assertEquals(0,cal.add(-1, 1));
		assertEquals(-5,cal.add(-2, -3));
	}
	
	
	//Test Division without using Assertions
	@Test
	void test3() {
		
		if(cal.division(15, 5) != 3) {
			fail("Division Test Fail.");
		}
		else if(cal.division(-15, 5) != -3) {
			fail("Division Test Fail.");
		}
		else if(cal.division(-15, -5) !=  3) {
			fail("Division Test Fail.");
		}
	}
	
	//Test Division using Assertions
	@Test
	void test4() {
		
		assertEquals(3, cal.division(15, 5));
		assertEquals(-3, cal.division(-15, 5));
		assertEquals(3, cal.division(-15, -5));
	}
	
	
}
