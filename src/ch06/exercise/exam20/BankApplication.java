package ch06.exercise.exam20;

import java.util.*;

public class BankApplication {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Account[] accounts = new Account[100];
		int numAccount = 0;
		boolean run = true;
		
	
		while (run) {
			System.out.println("--------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("--------------------------------------------------");
			System.out.print("선택> ");

			int choice = scanner.nextInt();
			
			switch (choice) {
			case 1 -> {
				//계좌생성
				System.out.println("--------");
				System.out.println("계좌생성");
				System.out.println("--------");
				
				System.out.print("계좌번호: ");
				String accNum = scanner.next();
			
				System.out.print("계좌주: ");
				String accName = scanner.next();
				
				System.out.print("초기입금금액: ");
				int balance = scanner.nextInt();
				
				Account account = new Account();
				account.setAccNum(accNum);
				account.setAccName(accName);
				account.setBalance(balance);
				accounts[numAccount] = account;
				numAccount++;
				
				System.out.println("결과 : 계좌가 생성되었습니다.");
				
			}
			case 2 -> {
				//계좌목록
				System.out.println("--------");
				System.out.println("계좌목록");
				System.out.println("--------");
				
				for (int i=0; i<numAccount; i++) {
					System.out.printf("%7s%10s%10d%n", accounts[i].getAccNum(), accounts[i].getAccName(), accounts[i].getBalance());
				}
			}
			case 3 -> {
				//예금
				System.out.println("--------");
				System.out.println("예금");
				System.out.println("--------");
				
				System.out.print("계좌번호: ");
				String plusFind = scanner.next();
				
				System.out.print("예금액: ");
				int plus = scanner.nextInt();
				
				//입력된 계좌번호 가진 Account객체 찾아서
				for (int k=0; k<numAccount; k++) {
					Account cur = accounts[k];
					
					if (cur.getAccNum().equals(plusFind)) {
						//입력받은 금액을 더해서 다시 넣어준다(set)
						int money = cur.getBalance() + plus;
						cur.setBalance(money);
					} 	
				}
			}
			case 4 -> {
				//출금
				System.out.println("--------");
				System.out.println("출금");
				System.out.println("--------");
				
				System.out.print("계좌번호: ");
				String minusFind = scanner.next();
				
				System.out.print("출금액: ");
				int minus = scanner.nextInt();
				
				//입력된 계좌번호를 가진 Account객체 찾아서
				for (int k=0; k<numAccount; k++) {
//					Account cur = accounts[k];
					
					if (accounts[k].getAccNum().equals(minusFind)) {
						//입력받은 금액을 빼서 다시 넣어준다(set)
						int money = accounts[k].getBalance() - minus;
						accounts[k].setBalance(money);
					} 
				}
				System.out.println("결과 : 출금이 성공되었습니다.");
			}
			case 5 -> {
				//종료
				run = false;
			}

			}
		}
		System.out.println("프로그램 종료");
	}
}
