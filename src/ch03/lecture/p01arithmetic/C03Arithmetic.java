package ch03.lecture.p01arithmetic;

import java.util.Scanner;

public class C03Arithmetic {
	public static void main(String[] args) {
		//백준 2588
		
		String input = """
				472
				385""";
		Scanner scanner = new Scanner(input);
		
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		//내가 푼거
//		int a = num2 - ((num2 / 10) * 10);
//		int a1 = num1 * a;
//		System.out.println(a1);
//		
//		int b = num2 - ((num2 / 100) *100) - a;
//		int b1 = num1 * b;
//		System.out.println(b1/10);
//		
//		int c = num2 - a - b;
//		int c1 = num1 * c;
//		System.out.println(c1/100);
//		
//		int total = a1 + b1 + c1;
		
		//쌤이 푼거
		int a = num2 % 10;  //일의 자리 5
		int b = (num2 % 100) / 10;  //십의 자리 80
		int c = num2 / 100;  //백의 자리  300
		
		int line3 = a * num1;
		System.out.println(line3);
		int line4 = b * num1;
		System.out.println(line4);
		int line5 = c * num1;
		System.out.println(line5);
		
		int total = line3 + (line4*10) + (line5 * 100);
		System.out.println(total);
	
		
	}
}	
