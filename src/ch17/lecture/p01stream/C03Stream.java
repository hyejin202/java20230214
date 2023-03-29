package ch17.lecture.p01stream;

import java.util.*;
import java.util.stream.*;

public class C03Stream {
	public static void main(String[] args) {
		// collection -> stream
		List<Integer> list = List.of(9, 7, 6, 5, 4, 3, 2);
		
		Stream<Integer> stream1 = list.stream();
		long count = stream1.count();
//		System.out.println(stream1.max(Integer::compare));
		System.out.println(count);
		
		Stream<Integer> stream2 = list.stream();
		Optional<Integer> max = stream2.max(Integer::compare);
		System.out.println(max.get());
		
		
		
	}
}
