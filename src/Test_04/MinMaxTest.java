package Test_04;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

class MinMaxTest {
	
	int[] nums = {5, 10, -1, 15, 0, 22, -2};

	MinMax m1 = new MinMax();
	
	@Test
	void test1() {
		
		assertEquals(-2,m1.getMin(nums));

	}
	
	
	@Test
	void test2() {
		
		assertEquals(-2,m1.getMinimum(nums));

	}
	
	@Test
	void test3() {
		
		assertEquals(22,m1.getMax(nums));

	}
}
