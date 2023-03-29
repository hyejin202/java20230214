package ch15.lecture.p02collections;

import java.util.*;

public class C01Collections {
	public static void main(String[] args) {
		//수정 불가 리스트
		List<String> list1 = List.of("java", "css",  "spring", "jsp", "html");  
		//수정 가능 리스트로 다시 만듦
		List<String> list2 = new ArrayList<>(list1);  
		
		//sort 
//		Collections.sort(list1);  //exception 발생
		Collections.sort(list2); 
		
		System.out.println(list2);   //css, html, java, jsp, spring
		
		//max
		String maxStr = Collections.max(list1);
		System.out.println(maxStr);  //spring
		
		//min
		String minStr = Collections.min(list1);
		System.out.println(minStr); //css
		
		//reverse : 거꾸로
		Collections.reverse(list2);
		System.out.println(list2);  //spring, jsp, java, html, css
		
		//fill : 특정 리스트의 모든 값을 특정 값으로 바꿔줌
		Collections.fill(list2, "web");
		System.out.println(list2);  //web, web, web, web, web
		
		
	}
}

