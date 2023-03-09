package ch13.exercise.exam05;

import java.util.*;

public class StudentExample {
	public static void main(String[] args) {
		//Student를 저장하는 HashSet 생성
		HashSet<Student> hashSet = new HashSet<Student>();   //<Student> 생략가능
		
		//Student 저장
		hashSet.add(new Student("1"));
		hashSet.add(new Student("1"));  //같은 학번이므로 중복 저장이 안됨
		hashSet.add(new Student("2"));
		
		//저장된 Student 수 출력
		System.out.println("저장된 student 수 : " + hashSet.size());
	}
}
