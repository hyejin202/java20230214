package ch02.lecture.p04scanner;

import java.util.Scanner;

public class C01Scanner {
	public static void main(String[] args) {
		// Scanner로 키보드로 입력받은 내용을 프로그램으로 가져올 수 있다.
		
		//String도 가능
		
		String input1 = """
				동해문과 백두산이
				마르고 닳도록
				하느님이 보우하사
				우리나라 만세""";
		
		Scanner scanner = new Scanner(input1);
		//ctrl + shift + o : 자동 import 단축키(3번째 줄 생김)
		
		String line1 = scanner.nextLine();
		System.out.println(line1);
		String line2 = scanner.nextLine();
		System.out.println(line2);
		System.out.println(scanner.nextLine()); // 그 다음줄
		System.out.println(scanner.nextLine()); //그 다음줄
//		System.out.println(scanner.nextLine());  //더이상 읽을게 없음
		
		
		
		
	}

}
