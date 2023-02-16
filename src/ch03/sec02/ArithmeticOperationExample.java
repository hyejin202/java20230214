package ch03.sec02;

public class ArithmeticOperationExample {
	public static void main(String[] args) {
		byte v1 = 10;
		byte v2 = 4;
		int v3 = 5;
		long v4 = 10L;
		
		int res1 = v1 + v2;   //모든 피연산자는 int 타입으로 자동 변환 후 연산
		System.out.println(res1);
		
		long res2 = v1 + v2 - v4; //모든 피연산자는 long 타입으로 자동 변환 후 연산
		System.out.println(res2);
		
		double res3 = (double) v1 / v2; // double 타입으로 강제 변환 후 연산 //2.5
		double res5 = (double) (v1 / v2);  // 2.0
		System.out.println(res3);
		System.out.println(res5);
		
		int res4 = v1 % v2;
		System.out.println(res4);
	}
}
