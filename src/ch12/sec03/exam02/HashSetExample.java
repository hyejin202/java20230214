package ch12.sec03.exam02;

import java.util.*;

public class HashSetExample {
	public static void main(String[] args) {
		HashSet hashSet = new HashSet();
		
		Student s1 = new Student(1, "홍길동");
		hashSet.add(s1);
		System.out.println("저장된 객체 수 : " + hashSet.size());  //1
		
		Student s2 = new Student(1, "홍길동");
		hashSet.add(s2);
		System.out.println("저장된 객체 수 : " + hashSet.size());  //1 동등객체는 중복 저장 X
		
		Student s3 = new Student(2, "홍길동");
		hashSet.add(s3);
		System.out.println("저장된 객체 수 : " + hashSet.size());  //2
	}
}
