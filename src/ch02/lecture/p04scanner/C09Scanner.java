package ch02.lecture.p04scanner;

import java.util.Scanner;

public class C09Scanner {
	public static void main(String[] args) {
		//백준 25304
//		String input = """
//				260000
//				4
//				20000 5
//				30000 2
//				10000 6
//				5000 8""";
		String input = """
				250000
				4
				20000 5
				30000 2
				10000 6
				5000 8""";
		Scanner scanner = new Scanner(input);
		int total = scanner.nextInt();
		int count = scanner.nextInt();
		int sum = 0;
		
		for (int i = 0; i < count; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			
			sum += (a*b);
		
		}
		if (total == sum) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}

}
