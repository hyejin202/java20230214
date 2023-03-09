package ch12.lecture.p03math;

public class C01Math {
	public static void main(String[] args) {
		// Math class : 수학 연산에 필요한 메소드를 가진 클래스
		// 모두 static method

		// random

		// round : 반올림
		long l1 = Math.round(3.5);
		System.out.println(l1); // 4

		long l2 = Math.round(3.14);
		System.out.println(l2); // 3

		// ceil : 올림
		double d1 = Math.ceil(3.5);
		System.out.println(d1); // 4.0
		double d2 = Math.ceil(2.1); 
		System.out.println(d2); // 3.0

		// floor : 버림
		double d3 = Math.floor(3.14);  
		double d4 = Math.floor(3.9);  

		System.out.println(d3);//3.0 
		System.out.println(d4);//3.0 

		// max : 둘 중에 큰 값
		double d5 = Math.max(3.14, 3.5);
		long d6 = Math.max(30L, 50L);
		int d7 = Math.max(5, 3);

		System.out.println(d5); // 3.5
		System.out.println(d6); //50
		System.out.println(d7); //5

		// min : 둘 중에 작은 값
		double d8 = Math.min(3.14, 3.5);
		long d9 = Math.min(300L, 500L);
		int d10 = Math.min(5, 3);

		System.out.println(d8); // 3.14
		System.out.println(d9); //30
		System.out.println(d10); //3

	}
}
