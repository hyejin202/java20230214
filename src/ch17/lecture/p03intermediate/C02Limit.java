package ch17.lecture.p03intermediate;

import java.util.*;
import java.util.stream.*;

public class C02Limit {
	public static void main(String[] args) {
		// limit 중간연산 : 크기 제한
		
		List<String> list = List.of("java", "css", "html", "spring", "react");
		Stream<String> stream1 = list.stream();
		Stream<String> stream2 = stream1.limit(3);  // 스트림 원소 중 3개로 제한
		
		long cnt = stream2.count();
		System.out.println(cnt);
		
		//method chaining -드물게 코드가 매우 어려울 때 제외하고 쓰기
		long cnt2 = list.stream()
				.limit(3)
				.count();
		System.out.println(cnt2);
		
		
	}
}
