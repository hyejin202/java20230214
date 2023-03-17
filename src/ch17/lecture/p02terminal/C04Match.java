package ch17.lecture.p02terminal;

import java.util.*;

public class C04Match {
	public static void main(String[] args) {
		//match
		//allMatch
		//anyMatch
		//noneMatch
		
		List<Integer> list = List.of(3, 5, 7, 9, 10);
		
		boolean b1 = list.stream().allMatch(e -> e > 0);
		System.out.println(b1);
		
		boolean b2 = list.stream().anyMatch(e -> e < 0);
		System.out.println(b2);
		
		boolean b3 = list.stream().noneMatch(e -> e < 0);
		System.out.println(b3);

		
		
		

		
		
	}
}
