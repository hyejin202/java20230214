package ch05.lecture.p08regex;

public class C19RegEx {
	public static void main(String[] args) {
		// 빈칸
		// \s
		
		String pattern1 = "\\s";
		
		System.out.println(" ".matches(pattern1));  // 빈칸
		System.out.println("\n".matches(pattern1));  //엔터
		System.out.println("\t".matches(pattern1));  // 탭 
		
		//소문자 단어 3개로 이루어져 있는지?
		String pattern2 = "\s*[a-z]+\s[a-z]+\s[a-z]+\s*";
		System.out.println("hello world java".matches(pattern2));  //true
		System.out.println("hello world".matches(pattern2));  //false
		System.out.println("    hello world java   ".matches(pattern2)); //true
		System.out.println(" Hello World Java".matches(pattern2)); //false
	}
}
