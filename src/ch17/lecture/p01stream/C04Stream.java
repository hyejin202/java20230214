package ch17.lecture.p01stream;

import java.util.*;
import java.util.stream.*;

public class C04Stream {
	public static void main(String[] args) {
		// collection -> stream
		Collection<Integer> set = Set.of(8, 4, 2, 6, 9, 7, 5, 10);
		
		Stream<Integer> stream1 = set.stream();
		long count = stream1.count();
		System.out.println(count);
		
		Stream<Integer> stream2 = set.stream();
		Optional<Integer> max = stream2.max(Integer::compare);
		System.out.println(max.get());
	}
}
