package ch05.exercise;

import java.util.Scanner;

public class Example09 {
	public static void main(String[] args) {
		int student = 0;
		int[] scores = null;
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		
	    while (run) {
			System.out.println("------------------------------------------------------------");
			System.out.println("1. 학생 수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5.종료");
			System.out.println("------------------------------------------------------------");
			System.out.print("선택> ");
			
			int choice = scanner.nextInt();
			
			
			switch (choice) {
			case 1 -> {
				System.out.print("학생수> ");
				student = scanner.nextInt();
				
				scores = new int[student];
			}
			case 2 -> {
				for (int i=0; i<student; i++) {
					System.out.print("scores[" + i + "] > ");
					scores[i] = scanner.nextInt();
				}
			}
			case 3 -> {
				for (int i=0; i<scores.length; i++) {
					System.out.println("scores[" + i + "] : " + scores[i]);
				}
			}
			case 4 -> {
				int max = 0;
				for (int i=0; i<scores.length; i++) {
					if (max < scores[i]) {
						max = scores[i];
					}
				}
				System.out.println("최고 점수 : " + max);
				
				int sum = 0;
				for (int k=0; k<scores.length; k++) {
					sum += scores[k];
				}
				double avg = (double) sum / student;
				System.out.println("평균 점수 : " + avg);
			}
			case 5 -> {
				run = false;
			}
			};
		}
	    System.out.println("프로그램 종료");
	}
}
		

