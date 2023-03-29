package ch15.lecture.p03set;

import java.util.*;

public class C04Contains {
	public static void main(String[] args) {
		Set<String> set = Set.of("java", "css","html", "jsp");
		
		//contains : 해당 원소가 이미 있는지? 
		//리턴: boolean
		System.out.println(set.contains("java"));  //true
		System.out.println(set.contains("html"));  //true
		System.out.println(set.contains("python")); //false
		
		System.out.println(set.contains(new String("java")));  //true
		
		
		
		
		
		
		
		
		
	}
}
