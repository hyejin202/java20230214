package ch02.lecture.p04scanner;

import java.util.Scanner;

public class C08Scanner {
	public static void main(String[] args) {
		// 백준 10950
		String input = """
				5
				1 1
				2 3
				3 4
				9 8
				5 2""";
		Scanner scanner = new Scanner(input);
//		Scanner scanner = new Scanner(System.in);
		
		int loop = scanner.nextInt();
		
		for (int i = 0; i < loop; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			
			System.out.println(a + b);
		}
		
	}

}
