package ch03.lecture.p01arithmetic;

public class C01Arithmetic {
	public static void main(String[] args) {
		//산술연산자
		// +, -, *, /, %
		
		int i1 = 30;
		int i2 = 50;
		
		System.out.println(i1 + i2); //더하기
		System.out.println(i1 - i2); //빼기
		System.out.println(i1 * i2); //곱하기
		System.out.println(i2 / i1); //나누기 - 정수간의 연산의 결과는 정수
		System.out.println(i2 % i1); //나머지(modilo, reminder)
		
		double d1 = 3.14;
		double d2 = 9.9;
		
		System.out.println(d1 + d2);
		System.out.println(d1 - d2);
		System.out.println(d1 * d2);
		System.out.println(d1 / d2);
		
		//정수와 실수의 산술연산
		//결과는 실수
		int i3 = 10;
		double d3 = 3;
		System.out.println(i3 + d3);  //13.0
		System.out.println(i3 - d3);  //7.0
		System.out.println(i3 * d3);  //30.0
		System.out.println(i3 / d3);  //3.33333
		
		//*, /, % 가 +, - 보다 우선순위 높음
		int i4 = 5 + 3 / 2;
		System.out.println(i4); //6
		int i5 = 5 * 3 + 10; 
		System.out.println(i5); //25
		int i6 = 9 + 10 % 3; 
		System.out.println(i6); //10
		//괄호써주기
		int i7 = 5 + (3 /2);
		int i8 = (5 * 3) + 10;
		int i9 = 9 + (10 % 3);
		System.out.printf("%d %d %d\n", i7, i8, i9);
		
		int i10 = (5 + 3) / 2; //4
		int i11 = 5 * (3 + 10); //65
		int i12 = (9 + 10) % 3; //1
		System.out.printf("%d %d %d", i10, i11, i12);
	
		
		
	}
}
