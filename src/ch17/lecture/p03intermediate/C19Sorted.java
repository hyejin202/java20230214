package ch17.lecture.p03intermediate;

import java.util.*;
import java.util.stream.*;

public class C19Sorted {
	public static void main(String[] args) {
		
		//1 -> 6
		IntStream.range(1,  6)
			.forEach(System.out::println);
		
		//거꾸로 5->1 출력
		IntStream.range(1,  6)
				.boxed()       //stream<Integer> 에 있는 sorted를 쓰기 위해 IntStream->Stream<Integer> 해줘야함 => boxed
				.sorted(Comparator.reverseOrder())   
				.forEach(System.out::println);
		
	}
}
