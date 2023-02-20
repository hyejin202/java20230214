package ch04.exercise;

public class Example03 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		
		while (i <= 100) {
			if (i % 3 == 0) {
				sum += i;
			}
			i++;
		}
		System.out.println("1~100 3의 배수의 합 : " + sum);
	}
}
