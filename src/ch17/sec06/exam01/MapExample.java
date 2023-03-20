package ch17.sec06.exam01;

import java.util.*;

public class MapExample {
	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("홍길동", 85));
		studentList.add(new Student("홍길동", 92));
		studentList.add(new Student("홍길동", 87));
		
		//Student를 score 스트링으로 변환
		studentList.stream()
			.mapToInt(Student::getScore)  //s -> s.getScore()
			.forEach(System.out::println);
		
		//최고 점수 (max)
		int max = studentList.stream()
				.mapToInt(Student::getScore)
				.max()
				.getAsInt();
		System.out.println("최고 점수 : " + max);
				
		//최저 점수 (min)
		int min  = studentList.stream()
				.mapToInt(Student::getScore)
				.min()
				.getAsInt();
		System.out.println("최저 점수 : " + min);
		
		//총합 (sum)
		int sum = studentList.stream()
				.mapToInt(Student::getScore)
				.sum();   //sum은 바로 리턴함
		System.out.println("점수 총합 : "  + sum);
		
		//평균 (average)
		double avg = studentList.stream()
				.mapToInt(Student::getScore)
				.average()
				.getAsDouble();
		System.out.println(avg);
		
		// 통계, 한번에 구하기
		IntSummaryStatistics summary =  studentList.stream()
				.mapToInt(Student::getScore)
				.summaryStatistics();
		System.out.println("최대 : " + summary.getMax());
		System.out.println("최소 : "  + summary.getMin());
		System.out.println("총합 : " + summary.getSum());
		System.out.println("평균 : " + summary.getAverage());
		
	}
}
