package ch17.lecture.p02terminal;

import java.util.*;

public class C05Find {
	public static void main(String[] args) {
		//findFirst
		//findAny
		
		// Optional<T>
		// 있을 수도 있고 없을 수도 없다는 의미의 제네릭 타입, non-null을 가질수도 안가질수도 있음
		Optional<String> o1 =Optional.of("java");  //"java"라는 스트링 객체를 품고 있음
		System.out.println(o1.isPresent()); //true, 하나라도 존재하나?
		System.out.println(o1.isEmpty());  //false, 비어있는가?
		System.out.println(o1.get());  //java, 값이 있다면 가져와라
		System.out.println(o1.orElse("default"));  //값이 없다면 대신 출력
		
		System.out.println();
		
		Optional<String> o2 = Optional.ofNullable(null);   //Optional.of(null) X 안됨 , null을 저장하려면 Optional.ofNullable(Null)사용
		System.out.println(o2.isPresent());  //false, 존재하지 않는다
		System.out.println(o2.isEmpty());  //true. 비어있다
//		System.out.println(o2.get());  //null값이라 가져오지 못함, exception 발생
		System.out.println(o2.orElse("defalut"));  //default
		
		
		
	}
}
