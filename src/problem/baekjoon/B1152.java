package problem.baekjoon;

import java.util.Scanner;

public class B1152 {
	public static void main(String[] args) {
//		String input = "The Curious Case of Benjamin Button";
//		String input = "The first character is a blank";
		String input = " The last character is a blank ";
		
		Scanner scanner = new Scanner(input);
		String str1 = scanner.nextLine();
		String str2 = str1.trim();
		
		String[] arr = str2.split(" ");
		
		
		System.out.println(arr.length);
		
		/*
		 * int answer = 0;
		 for (int i=0; i<arr.length; i++) {
		 	if (! arr[i].equals("")){
		 		answer++;
		 	}
		 }
		 System.out.println(answer);
		 */
		
		
	}
}
