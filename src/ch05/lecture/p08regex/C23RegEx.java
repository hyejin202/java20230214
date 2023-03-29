package ch05.lecture.p08regex;

public class C23RegEx {
	public static void main(String[] args) {
		// . (모든 문자)
		// \. ('.'이란 문자를 표현)
		
		String pattern1 = ".";
		String pattern2 = "\\.";
		
		System.out.println("a".matches(pattern1));
		System.out.println("a".matches(pattern2));
		
		System.out.println(".".matches(pattern1));
		System.out.println(".".matches(pattern2));
		
		//영대소문자 여러개 .com으로 끝나는지?
		String pattern3 = "[a-zA-Z]+\\.com";
		System.out.println("daum.com".matches(pattern3));  //t
		System.out.println("daum.net".matches(pattern3));  //f
		System.out.println("daumcom".matches(pattern3));  //f
		//모든 문자 여러개 .com으로 끝남
		String pattern4 = ".+\\.com";
		System.out.println("daum.com".matches(pattern4));  //t
		
	}
}
