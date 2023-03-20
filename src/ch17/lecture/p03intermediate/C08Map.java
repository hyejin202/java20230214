package ch17.lecture.p03intermediate;

import java.util.*;

public class C08Map {
	public static void main(String[] args) {
		// map : 매핑 (변환)
		List<Integer> list = List.of(2, 1, 0, 3, 9);
		
		list.stream()
			.map(s -> 0)   //0으로 매핑
			.forEach(System.out::println);  //0, 0, 0, 0, 0
		
		System.out.println("* 2(짝수) 로 매핑####");
		list.stream()
			.map(s -> s*2)
			.forEach(System.out::println);  // 4, 2, 0, 6, 18
		
		
	}
}
