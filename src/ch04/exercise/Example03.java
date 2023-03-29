package ch04.exercise;

public class Example03 {
	public static void main(String[] args) {
		//while
//		int sum = 0;
//		int i = 1;
//		
//		while (i <= 100) {
//			if (i % 3 == 0) {
//				sum += i;
//			}
//			i++;
//		}
//		System.out.println("1~100 3의 배수의 합 : " + sum);
		
		//for-1
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println("1~100 3의 배수의 합 : " + sum);
		//for-2
		sum = 0;
		for(int i=0; i<=100; i+=3) {
			sum += i;	
		}
		System.out.println(sum);
	}
}
