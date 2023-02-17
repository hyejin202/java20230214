package ch03.lecture.p04logical;

public class C04ShortCircuit {
	public static void main(String[] args) {
		// ||
		// true || true : true
		// true || false : true
		// false || true : true
		// false || false : false
		
		int x = 10;
		if ((x++ > 100) || (x++ < 0)) {
			System.out.println("실행됨1");  //첫번째 항이 false여서 두번째 항도 연산함
		}
		System.out.println(x);
		
		x = 10;
		if ((x++ > 100) | (x++ > 0)) {
			System.out.println("실행됨2");
		}
		System.out.println(x);
		
		x = 10;
		if ((x++ > 0) || (x++ < 100)) {
			System.out.println("실행됨3");
		}
		System.out.println(x);   //첫번째 항이 true여서 두번째 항 연산하지 않음(short circuit)- ||이 더 효율적
		
		x = 10;
		if ((x++ > 0) | (x++ < -100)) {
			System.out.println("실행됨4");
		}
		System.out.println(x);
	}
}
