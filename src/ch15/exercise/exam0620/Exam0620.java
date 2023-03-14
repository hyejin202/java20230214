package ch15.exercise.exam0620;

import java.util.*;

import ch06.exercise.exam20.*;


public class Exam0620 {   //BankApplication
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		
//		Account[] accounts = new Account[100];
		//
		List<Account> accounts = new ArrayList<>();
		


		while (run) {
			System.out.println("--------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("--------------------------------------------------");
			System.out.print("선택> ");

			int choice = scanner.nextInt();

			switch (choice) {
			case 1 -> {
				// 계좌생성
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
				
				accounts.add(account);
				System.out.println("결과 : 계좌가 생성되었습니다.");

			}
			case 2 -> {
				// 계좌목록
				System.out.println("--------");
				System.out.println("계좌목록");
				System.out.println("--------");
				
				for (Account account : accounts) {
					System.out.printf("%7s%10s%10d%n", account.getAccNum(), account.getAccName(), account.getBalance());
				}

				
			}
			case 3 -> {
				// 예금
				System.out.println("--------");
				System.out.println("예금");
				System.out.println("--------");

				System.out.print("계좌번호: ");
				String AccNum = scanner.next();
				
				System.out.print("예금액: ");
				int plus = scanner.nextInt();
				
				// 입력된 계좌번호를 가진 Account 객체 찾아서
				accounts.forEach(account -> {
					if (account.getAccNum().equals(AccNum)) {
						// 입력 받은 금액을 더해서 다시 넣어준다(set)
						int money = account.getBalance() + plus;
						account.setBalance(money);
					}
				});

				System.out.println("결과: 예금이 성공되었습니다.");
				
			}
			case 4 -> {
				// 출금
				System.out.println("--------");
				System.out.println("출금");
				System.out.println("--------");
				
				System.out.print("계좌번호: ");
				String accNum = scanner.next();

				System.out.print("출금액: ");
				int minus = scanner.nextInt();
				
				// 입력된 계좌번호를 가진 Account 객체 찾아서
				for (Account account : accounts) {
					if (account.getAccNum().equals(minus)) {
						// 입력 받은 금액을 빼서 다시 넣어준다(set)
						int money = account.getBalance() - minus;
						account.setBalance(money);
					}
				}
				System.out.println("결과 : 출금이 성공되었습니다.");
			}
			case 5 -> {
				// 종료
				run = false;
			}

			}
		}
		System.out.println("프로그램 종료");
	}
}

