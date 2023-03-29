package problem.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

class Leet2206Test {

	@Test
	void test1() {
		Leet2206 o1 = new Leet2206();
		 assertTrue(o1.divideArray(new int[] {3, 2, 3, 2, 2, 2}));
	}
	
	@Test
	void test2() {
		Leet2206 o1 = new Leet2206();
		assertFalse(o1.divideArray(new int[] {1, 2, 3, 4}));
	}

}
