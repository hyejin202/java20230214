package ch02.lecture.p05print;

import java.util.Scanner;

public class C08Print {
	public static void main(String[] args) {
		// 백준 11021
		String input = """
				5
				1 1
				2 3
				3 4
				9 8
				5 2""";
		

		Scanner scanner = new Scanner(input);

		int loop = scanner.nextInt();
		for (int i = 0; i < loop; i++) {
			int num1 = scanner.nextInt();
			int num2 = scanner.nextInt();

			System.out.printf("Case #%2$d : %1$d%n", (num1 + num2), (i + 1));
		}
	}
}
