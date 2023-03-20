package ch17.exercise.exam07;

import java.util.*;
import java.util.stream.*;

public class Example {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("홍길동", "개발자"),
				new Member("김나라", "디자이너"),
				new Member("신용권", "개발자")
				);
		
		List<Member> developers = new ArrayList<>();
		//1
		list.stream()
			.filter(a->a.getJob().equals("개발자"))
			.forEach(e -> System.out.println(e.getName()));
			
		System.out.println();
		//2
		list.stream()
			.filter(m -> m.getJob().equals("개발자"))
			.map(Member::getName)
			.forEach(System.out::println);
		
		//3
		for(Member m : list) {
			if (m.getJob().equals("개발자")) {
				System.out.println(m.getName());
//				developers.add(m);
			}
		}
		System.out.println();
		//4
		 List<Member> developer = list.stream()
				.filter(m -> m.getJob().equals("개발자"))
				.collect(Collectors.toList());   //수집한 요소들을 List컬렉션으로 얻기
		 developer.stream()
		 	.forEach(s -> System.out.println(s.getName()));
		
	}
}
