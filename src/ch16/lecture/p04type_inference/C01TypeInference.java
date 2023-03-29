package ch16.lecture.p04type_inference;

import java.util.*;

public class C01TypeInference {
	//타입 추론
	//타입 유추가 가능하면 모두 생략
	public static void main(String[] args) {
		Box<String> box1 = new Box<String>();
		Box<String> box2 = new Box<>();  // 추론 가능해 생략 가능
		
		List<List<Integer>> list1 = new ArrayList<List<Integer>>();
		List<List<Integer>> list2 = new ArrayList<>();
		
		MyInterface01 o1 = (int a, String b) -> b;
		MyInterface01 o2 = (a, b) -> b;
		
		
		
	}
}

interface MyInterface01 {
	String action(int a, String b);
}

class Box<T> {
	private T t;
	
}
