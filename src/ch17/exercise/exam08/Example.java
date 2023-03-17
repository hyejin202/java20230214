package ch17.exercise.exam08;

import java.util.*;
import java.util.stream.*;

public class Example {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("홍길동", "개발자"),
				new Member("김나라", "디자이너"),
				new Member("신용권", "개발자")
				);
		
		//stream 사용
//		Map<String, List<Member>> groupingMap = list.stream()
//				.collect(Collectors.groupingBy(Member::getJob));
//
//		System.out.println("[개발자]");
//		groupingMap.get("개발자").stream().forEach(System.out::println);
//		
//		System.out.println();
//		
//		System.out.println("[디자이너]");
//		groupingMap.get("디자이너").stream().forEach(System.out::println);
//			
//		}
//		
		//for문 사용 - 고전적 방법
		Map<String, List<Member>> map = new HashMap<>();
		
		for(Member member : list) {
			List<Member> val = map.get(member.getJob());
			if (val == null) {
				val = new ArrayList<>();
				map.put(member.getJob(), val);
			}
			val.add(member);
		}
		
		System.out.println("[개발자]");
		List<Member> dev = map.get("개발자");
		for(Member d : dev) {
			System.out.println(d);
		}
		
		System.out.println();
		
		System.out.println("[디자이너]");
		List<Member> des = map.get("디자이너");
		for(Member d : map.get("디자이너")) {
			System.out.println(d);
		}
	}
}
