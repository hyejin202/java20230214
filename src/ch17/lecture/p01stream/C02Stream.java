package ch17.lecture.p01stream;

import java.util.*;
import java.util.stream.*;

public class C02Stream {
	public static void main(String[] args) {
		Stream<Integer> stream1 = Stream.of(8, 3, 6, 4, 1, 0);
		long cnt = stream1.count();
		System.out.println(cnt);
		
		Stream<Integer> stream2 = Stream.of(9, 8, 6, 5, 3, 2);
		Optional<Integer> max = stream2.max(Integer::compare);
		System.out.println(max.get());
	
	}
}
