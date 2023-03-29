package ch04.sec04;

public class PrintFrom1To10Example {
	public static void main(String[] args) {
		// 반복문 for
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(i + " ");
		}
		
		// 0~5
		for(int i = 0; i <= 5; i++) {
			System.out.println(i);
		}
		
		// 5~0
		for (int i = 5; i >= 0; i--) {
			System.out.println(i);
		}
	}
}
