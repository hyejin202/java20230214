package ch17.lecture.p03intermediate;

import java.util.*;
import java.util.stream.*;

public class C05Distinct {
	public static void main(String[] args) {
		// 로또 번호
		// 1 ~ 45 중 6개 랜덤
//		Stream<Integer> stream = Stream.generate(() -> 3);  //3을 계속 원소로 뽑아냄
		Stream<Integer> stream 
			= Stream.generate(() -> (int) (Math.random() * 45) + 1);
		stream
			.distinct()
			.limit(6)
			.forEach(System.out::println);
		
		System.out.println();
		
		// Random Class 사용
		Random random = new Random();
		
		Stream.generate(() -> random.nextInt(45) + 1)
			.distinct()
			.limit(6)
			.forEach(System.out::println);
		
	}
}
