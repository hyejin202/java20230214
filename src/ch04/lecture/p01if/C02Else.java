package ch04.lecture.p01if;

public class C02Else {
	public static void main(String[] args) {
		// else
		// if의 조건이 false일 경우 실행되는 블럭
		
		System.out.println("코드 실행1");
		if (false) {
			System.out.println("코드 실행2");
			System.out.println("코드 실행3");
		} else {
			System.out.println("코드 실행4");
			System.out.println("코드 실행5");
		}
		
		System.out.println("코드 실행...... 이어감");
		
		// else의 코드블럭의 명령문이 하나면 {} 생략가눙
		// 하지만 꼭 작성하기
		
		if (false) 
			System.out.println("코드 실행6");
		 else 
			System.out.println("코드 실행7");
		
		System.out.println("코드 계속 실행됨....");
	}
}
