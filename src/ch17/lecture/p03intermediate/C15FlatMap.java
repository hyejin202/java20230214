package ch17.lecture.p03intermediate;

import java.util.*;

public class C15FlatMap {
	public static void main(String[] args) {
		List<String> list = List.of(
				"hello world",
				"java program",
				"css html js"
				); 
		
		long count = list.stream()
				.flatMap(s -> Arrays.stream(s.split(" ")))     //string을 공백을 기준으로 쪼갠걸 스트림으로 변환
				.count();
		System.out.println(count);
		
		
		
	}
}
