package problem.baekjoon;

import java.util.Scanner;

public class B9086 {
	public static void main(String[] args) {
		String input = """
				3
				ACDKJFOWIEGHE
				O
				AB""";
		Scanner scanner = new Scanner(input);
		String resStr = "";
		
		int loop = Integer.parseInt(scanner.nextLine());
		 
		//1
		  /*for (int i=0; i<loop; i++) {
			String str = scanner.nextLine();
			resStr +=  str.charAt(0);
			resStr += str.charAt(str.length() - 1);
			System.out.println(resStr);
			resStr = "";
		}
		*/
		
		//2
		for (int i=0; i<loop; i++) {
			String str = scanner.nextLine();
			
			char first =  str.charAt(0);
			char last = str.charAt(str.length() - 1);
			
			System.out.println("" + first + last);
		}
	}
}
