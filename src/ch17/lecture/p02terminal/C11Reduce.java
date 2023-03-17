package ch17.lecture.p02terminal;

import java.util.*;

public class C11Reduce {
	public static void main(String[] args) {
		List<Integer> list = List.of(3, 4, 5, 6);
		
		Integer r1 = list.stream()
				.reduce(0, Integer::sum); //초기값이랑 0이랑 들어가고 그 결과가 그 다음 원소랑 들어가고...반복
		System.out.println(r1);
		
		Integer r2 = list.stream()
				.reduce(1, (a, b) -> a*b);
		System.out.println(r2);	
	}
}
