package Test_01;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilitiesTest {

	@Test
	void test() {
		MathUtilities m1 = new MathUtilities();
		
		//int expected = 1;
		//int actual = m1.add(5,10);
		//assertEquals(expected,actual);
		
		assertEquals(15,m1.add(5,10));
	}

	
}
