package problem.baekjoon;

import java.util.Scanner;

public class B10798 {
	public static void main(String[] args) {
		//백준 10798
		String input = """
				ABCDE
				abcde
				01234
				FGHIJ
				fghij""";
//		String input = """
//				AABCDD
//				afzz
//				09121
//				a8EWg6
//				P5h3kx""";
		Scanner scanner = new Scanner(input);
		String[][] whole = new String[5][];  //5행을 가진 2차원 배열
		
		// String[][] whole = {{line1}, {line2}, {line3}, {line4}, {line5}};
		// line1 = {"A", "B", "c", "D", "E"}
		for (int i=0; i<5; i++) {
			whole[i] = scanner.nextLine().split("");  
		}
		//전체 탐색
		for (int i=0; i<whole.length; i++) {
			for (int k=0; k<whole[i].length; k++) {
				System.out.print(whole[i][k]);
			}
			System.out.println();
		}
		System.out.println();
		
		//가장 큰 길이 구하기
		int max = 0;
		for (int i=0; i<5; i++) {
			if (max < whole[i].length) {
				max = whole[i].length;
			}
		}
		
		for (int j=0; j<max; j++) {
			for (int k=0; k<5; k++) {
				if (j < whole[k].length) {
					System.out.print(whole[k][j]);
				}
			}
		}

			
		
	}
}
