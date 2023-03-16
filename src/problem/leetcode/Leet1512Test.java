package problem.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

class Leet1512Test {

	@Test
	void test1() {
		Leet1512 o1 = new Leet1512();
		assertEquals(4, o1.numIdenticalPairs(new int[] {1,2,3,1,1,3}));
	}
	@Test
	void test2() {
		Leet1512 o1 = new Leet1512();
		assertEquals(6, o1.numIdenticalPairs(new int[] {1,1,1,1}));
	}

}
