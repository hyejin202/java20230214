package ch02.lecture.p04scanner;

import java.util.Scanner;

public class C04Scanner {
	public static void main(String[] args) {
		String input = "3 33 555 50";
		Scanner scanner = new Scanner(input);
		
		int num1 = scanner.nextInt();  //nextInt() : input의 하나의 토큰을 int로 읽음
		System.out.println(num1);   //3
		int num2 = scanner.nextInt();
		System.out.println(num2); //33
		int num3 = scanner.nextInt();
		System.out.println(num3); //550
		System.out.println(scanner.nextInt());  //50
	}
}
