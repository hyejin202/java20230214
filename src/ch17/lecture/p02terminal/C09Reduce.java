package ch17.lecture.p02terminal;

import java.util.*;

public class C09Reduce {
	public static void main(String[] args) {
		List<Integer> list = List.of(9, 3, 6, 5, 1);
		Integer sum = list.stream()
				.reduce((a, b) -> a + b)
				.get();
		//합계를 구하는 메소드 스트림에는 없음(IntStream에는 있음)
		System.out.println(sum);
		
		Integer max = list.stream()
				.reduce(Math::max)
				.get();
		System.out.println(max);
		Integer min = list.stream()
				.reduce(Math::min)
				.get();
		System.out.println(min);
		
		
		
	}
}
