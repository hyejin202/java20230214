package ch17.sec01.exam01;

import java.util.*;
import java.util.stream.*;

public class StreamExample {
	public static void main(String[] args) {
		//Set 컬렉션
		Set<String> set = new HashSet<>();
		set.add("홍길동");
		set.add("신용권");
		set.add("감자바");
		
		//Stream을 이용한 요소 반복처리
		Stream<String> stream = set.stream();   
		stream.forEach(name -> System.out.println(name)); 
		
	}
}
