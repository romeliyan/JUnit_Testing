package Test_03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FactorialTest {
	
	Factorial fac = new Factorial();

	@Test
	void test() {
		
		assertEquals(2,fac.factorial(-2));
		assertEquals(1,fac.factorial(0));
		assertEquals(1,fac.factorial(1));
		
	}

}
