package problem.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

class Leet844Test {

	@Test
	void test1() {
		Leet844 o1 = new Leet844();
		assertTrue(o1.backspaceCompare("ab#c", "ad#c"));
	}
	@Test
	void test2() {
		Leet844 o1 = new Leet844();
		assertTrue(o1.backspaceCompare("ab##", "c#d#"));
	}
	@Test
	void test3() {
		Leet844 o1 = new Leet844();
		assertFalse(o1.backspaceCompare("a#c", "b"));
	}
	
	@Test
	void test4() {
		Leet844 o1 = new Leet844();
		assertTrue(o1.backspaceCompare("a##c", "#a#c"));
	}

}
