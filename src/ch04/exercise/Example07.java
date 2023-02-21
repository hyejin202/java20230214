package ch04.exercise;

import java.util.Scanner;

public class Example07 {
	public static void main(String[] args) {
		boolean run = true;
		int money = 0;
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("--------------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3.잔고 | 4. 종료");
			System.out.println("--------------------------------------");
			System.out.println("선택>");
			
			int i1 = scanner.nextInt();
			
			if (i1 == 1) {
				System.out.println("예금액>");
				money += scanner.nextInt(); 
			} else if (i1 == 2) {
				System.out.println("출금액>");
				money -= scanner.nextInt();
			} else if (i1 == 3) {
				System.out.println("잔고>" + money);
			} else if (i1 == 4) {
				break;
			}
			
//			switch(str) {
//			case "1" -> {
//				System.out.println("예금액>");
//				money += scanner.nextInt(); 
//			}
//			case "2" -> {
//				System.out.print("출금액>");
//				money -= scanner.nextInt();
//			}
//			case "3" -> {
//				System.out.print("잔고> " + money);
//			}
//			case "4" -> {
//				break;
//			}
//			};
		}
//		
			
		System.out.println("프로그램 종료");
	}
}

