package test;

import java.util.Scanner;

public class T01test01 {
	public static void main(String[] args) {
		String input = """
				472
				385""";
		Scanner scanner = new Scanner(input);
		
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		int a = num2 % 10;
		int b = (num2 % 100) / 10;
		int c = num2 / 100;
		
		int line3 = a * num1;
		int line4 = b * num1;
		int line5 = c * num1;
		
		int line6 = line3 + (line4 * 10) + (line5 * 100);
		
		System.out.println(line3);
		System.out.println(line4);
		System.out.println(line5);
		System.out.println(line6);
	}
}
