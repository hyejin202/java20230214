package ch17.lecture.p03intermediate;

import java.util.*;
import java.util.stream.*;

public class C10Map {
	public static void main(String[] args) {
		List<String> list = List.of("java", "html", "css", "spring");
		
		Stream<String> stream1= list.stream();
		// 다른 타입으로 매핑
		Stream<Integer> stream2 = stream1.map(e -> e.length());     //길이로 매핑
		stream2.forEach(System.out::println);
		
		System.out.println("짝수길이 스트링이 몇 개? ####");
		long cnt = list.stream()
			.map(s -> s.length())   //길이로 변환(인티저 타입으로 매핑)
			.filter(e -> (e % 2) == 0)  //짝수 필터링
			.count();               //개수
		System.out.println(cnt);
		
	}
}
