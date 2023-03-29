package ch12.lecture.p01object;

import java.util.*;

import ch06.lecture.p06final.*;

public class C02Object {
	public static void main(String[] args) {
		// 따라서 Object에 있는 메소드는 모든 클래스가 가지고 있다.
		String s = "java";
		s.toString();
		s.hashCode();
		s.equals("");
		
		Scanner sc = new Scanner("");
		sc.toString();
		sc.hashCode();
		sc.equals(null);
		
		MyClass02 o1 = new MyClass02();
		o1.equals(null);
		o1.hashCode();
		o1.toString();
	}
}

class MyClas02 {
	
}