package ch17.lecture.p02terminal;

import java.util.*;

public class C10Reduce {
	public static void main(String[] args) {
		List<String> list = List.of("java", "css", "html", "spring");

		Integer sum = list.stream()
				.map(e -> e.length()) // 4, 3, 4, 6 원소의 길이로 매핑됨
				.reduce(Integer::sum)
				.get();
		
		System.out.println(sum);

	}
}
