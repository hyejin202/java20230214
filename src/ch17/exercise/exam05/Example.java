package ch17.exercise.exam05;

import java.util.*;

public class Example {
	public static void main(String[] args) {
		List<String> list = Arrays.asList(
				"This is a java book",
				"Lambda Expressions", 
				"Java8 supports lambda expressions"
				);
		//고전적
		System.out.println("고전적 방법 ##");
		for(String s : list) {
			if(s.toLowerCase().contains("java")) {
				System.out.println(s);
			}
		}
		
		System.out.println();
		
		//stream 사용
		System.out.println("stream 사용##");
		list.stream()
			.filter(s -> s.toLowerCase().contains("java"))
			.forEach(System.out::println);
		
		System.out.println();
		list.stream()
		.filter(Example::havingJava)
		.forEach(System.out::println);
		
		
	}
	private static boolean havingJava(String s) {
		return s.toLowerCase().contains("java");
	}
}
