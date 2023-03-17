package ch17.lecture.p02terminal;

import java.util.*;

public class C07MaxMin {
	public static void main(String[] args) {
		List<Integer> list = List.of(1, 2, 3, 4, 5, 6);
		
		Integer max = list.stream()
			.max(Integer::compare)      //(a, b) -> Integer.compare(a,b)   (comparator)
			.get();
		
		System.out.println(max);
		
		Integer min = list.stream()
				.min(Integer::compareTo)     //(a, b) -> a.compareTo(b)   (comparable)
				.get();
		System.out.println(min);
		
	}
}
