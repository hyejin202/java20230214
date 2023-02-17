package ch03.lecture.p04logical;

public class C03ShortCircuit {
	public static void main(String[] args) {
		// &&
		// true && true : true
		// true && false : false
		// false && true : false
		// false && false : false
		
		int x = 10;
		if ((x++ > 0) && (x++ < 100)) {
			System.out.println("실행됨1");  //첫번째 항이 true여서 두번째항도 연산함
		}
		System.out.println(x);  
		
		x = 10;
		if ((x++ > 0) & (x++ < 5)) {
			System.out.println("실행됨2");
		}
		System.out.println(x);  //short circuit X
		
		x = 10;
		if ((x++ > 100) && (x++ < 200)) {
			System.out.println("실행됨3");
		}
		System.out.println(x);  //첫번째 항이 false여서 두번째 항 연산 안함 - short circuit
		
		x = 10;
		if ((x++ >100) & (x++ < 0)) {
			System.out.println("실행됨4");
		}
		System.out.println(x);  //short circuit X,  &&이 더 효율적
	}
}
