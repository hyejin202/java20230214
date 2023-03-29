package ch17.lecture.p01stream;

import java.util.*;
import java.util.stream.*;

public class C06Stream {
	public static void main(String[] args) {
		 // 원소가 참조 타입 스트림
		Stream<String> stream1 = Stream.of("java", "spring", "html");
		Stream<Integer> stream = Stream.of(1, 3, 5, 7);
		
		// 원소가 기본 타입 스트림
		IntStream stream2 = IntStream.of(8, 4, 2, 1);
		LongStream stream3 = LongStream.of(9, 10, 11, 12);
		DoubleStream stream4 = DoubleStream.of(3.14, 9.8, 1.3, 2.2);
		
		int[] intarr = {9, 10, 11, 12};
		IntStream stream5 = Arrays.stream(intarr);
//		Stream<Integer> stream6 = Arrays.stream(intarr);  // X
		
		
	}
}
