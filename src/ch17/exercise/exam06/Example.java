package ch17.exercise.exam06;

import java.util.*;
import java.util.stream.*;

public class Example {
	public static void main(String[] args) {
		//List에 저장되어 있는 Member의 평균 나이를 출력
		List<Member> list = Arrays.asList(
		new Member("홍길동", 30),
		new Member("신용권", 40),
		new Member("감자바", 26)
		);
		
		System.out.println("for 사용 ##");
		double sum = 0;
		for (Member m : list) {
			sum += m.getAge();
		}
		System.out.println("평균나이 : " + sum / list.size());
		
		System.out.println("stream, average 사용 ####");
		double avg1 = list.stream()
				.mapToInt(Member::getAge)
				.average()
				.getAsDouble();
		System.out.println("평균 나이: " + avg1);
		System.out.println("stream, collect 사용 ####");
		double avg2 = list.stream()
				.collect(Collectors.averagingDouble(Member::getAge));
		System.out.println("평균 나이: " + avg2);
		
		System.out.println("stream, summaryStatistics 메소드 사용 ####");
		IntSummaryStatistics summary = list.stream()
				.mapToInt(Member::getAge)
				.summaryStatistics();
		System.out.println("최대 : " + summary.getMax());
		System.out.println("최소 : " + summary.getMin());
		System.out.println(" 합 : " + summary.getSum());
		System.out.println("평균 : " + summary.getAverage());
	
	}
}
