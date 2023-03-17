package ch17.lecture.p02terminal;

import java.util.*;

public class C03ForEach {
	public static void main(String[] args) {
		List<String> list = List.of("java", "css", "html", "spring");
		
		list.stream()
			.forEach(s -> System.out.println(s));   //최종연산 대부분 FunctionalInterface->람다랑 잘 맞음
		list.stream()
			.forEach(s -> System.out.println("원소 : " + s));
		
		
		
		
		
	}
}
