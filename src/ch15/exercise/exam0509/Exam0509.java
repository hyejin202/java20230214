package ch15.exercise.exam0509;

import java.util.*;

public class Exam0509 {
	public static void main(String[] args) {
		int numOfStudent = 0;
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		
//		int[] scores = null;
		// 5장 확인문제 9번 list 이용
		List<Integer> list = new ArrayList<>();

		
	    while (run) {
			System.out.println("------------------------------------------------------------");
			System.out.println("1. 학생 수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5.종료");
			System.out.println("------------------------------------------------------------");
			System.out.print("선택> ");
			
			int choice = scanner.nextInt();
			
			
			switch (choice) {
			case 1 -> {
				System.out.print("학생수> ");
				numOfStudent = scanner.nextInt();
			}
			case 2 -> {
				for(int i=0; i<numOfStudent; i++) {
					System.out.print("scores[" + i+ "]>");
					list.add(scanner.nextInt());
				}
				
			}
			case 3 -> {
				//리스트 전체 탐색
				for(int i=0; i<list.size(); i++) {
					System.out.println("scores[" + i + "]: " + list.get(i));
				}	
			}
			case 4 -> {
				int max = Integer.MIN_VALUE;
				for(int m : list) {
					max = Math.max(max, m);
				}
				System.out.println("최고 점수: " + max);
				
				
				int sum = 0;
				for(int s : list) {
					sum += s;
				}
				
				System.out.println("평균 점수: " + (double) sum / list.size());
				
			}
			case 5 -> {
				run = false;
			}
			};
		}
	    System.out.println("프로그램 종료");
	
	}
}
