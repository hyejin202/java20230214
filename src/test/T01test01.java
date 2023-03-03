package test;

import java.util.*;

public class T01test01 {
	public static void main(String[] args) {
		//확인문제 20번
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		testClass[] accounts = new testClass[100];
		int numAccount = 0;
		
		while(run) {
			
			System.out.println("------------------");
			System.out.println("1 | 2 | 3 | 4 | 5 ");
			System.out.println("------------------");
			System.out.print("선택> ");
			
			int choice = scanner.nextInt();
			
			switch(choice) {
			case 1 -> {
				//계좌생성
				System.out.println("----");
				System.out.println(" 1 ");
				System.out.println("----");
				
				System.out.print("계좌번호: ");
				String accNum = scanner.next();
				System.out.print("계좌주: ");
				String accName = scanner.next();
				System.out.print("초기입금액: ");
				int balance = scanner.nextInt();
				
				testClass account = new testClass();
				account.setAccNum(accNum);
				account.setAccName(accName);
				account.setBalance(balance);
				accounts[numAccount] = account;
				numAccount++;
				
				System.out.print("생성 완료");
				
			}
			case 2 -> {
				//계좌목록
				System.out.println("----");
				System.out.println(" 2 ");
				System.out.println("----");
				
				for (int i=0; i<numAccount; i++) {
					System.out.printf("%7s%10s%10d%n", accounts[i].getAccNum(), accounts[i].getAccName(), accounts[i].getBalance());
				}
			}
			case 3 -> {
				//예금
				System.out.println("----");
				System.out.println(" 3 ");
				System.out.println("----");
				
				System.out.print("계좌번호: ");
				String plusFind = scanner.next();
				System.out.print("예금액: ");
				int plus = scanner.nextInt();
				
				for (int i=0; i<numAccount; i++) {
					
					if (accounts[i].getAccNum().equals(plusFind)) {
						accounts[i].balance += plus;
					}
				}
			}
			case 4 -> {
				//출금
				System.out.println("----");
				System.out.println(" 4 ");
				System.out.println("----");
				
				System.out.print("계좌번호: ");
				String minusFind = scanner.next();
				System.out.println("출금액");
				int minus = scanner.nextInt();
				
				for (int i=0; i<numAccount; i++) {
					if (accounts[i].getAccNum().equals(minusFind)) {
						accounts[i].balance -= minus;
					}
				}
			}
			case 5 -> {
				//종료
				run = false;
			}
			}
		}
	}
}
