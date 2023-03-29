package ch03.lecture.p01arithmetic;

public class C04Overflow {
	public static void main(String[] args) {
		long a = 15_0000_0000;
		long b = 17_0000_0000;
		
		System.out.println(a);
		System.out.println(b);
		
		//overflow : 타입의 최대허용값 	벗어남
		long c = a + b;
		System.out.println(c);   
		
		long d = -15_0000_0000;
		long e = -17_0000_0000;
		
		System.out.println(d);
		System.out.println(e);
		
		//underflow : 타입의 최솟값 벗어남
		long f = d + e;     //연산에서 언더플로우 일어남, 연산 변수의 타입부터 변경해야함
		System.out.println(f);
	}
}
