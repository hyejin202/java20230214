package ch03.lecture.p01arithmetic;

import java.util.Scanner;

public class C02Arithmetic {
	public static void main(String[] args) {
		//백준 1008
		String input = "1 3";
//		String input = "4 5";
		Scanner scanner = new Scanner(input);
		
//		int num1 = scanner.nextInt();
//		int num2 = scanner.nextInt();
//		
//		double res = (double)num1 / num2;
		
		//아예 숫자받을 때부터 double로 받기
		double num1 = scanner.nextDouble();
		double num2 = scanner.nextDouble();
		
		double res = num1 / num2;
		
		System.out.println(res);
	}
}
