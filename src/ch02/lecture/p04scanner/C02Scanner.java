package ch02.lecture.p04scanner;

import java.util.Scanner;

public class C02Scanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("키보드로 작성해보세요>");
		
		String line = scanner.nextLine(); 
		//현재라인을 훑고 지나가다가 라인 끝에 도달했을 때 훑은 라인을 리턴함
		
		System.out.println("입력된 값 출력");
		System.out.println(line);
		
	}
}
