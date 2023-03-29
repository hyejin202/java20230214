package ch05.lecture.p08regex;

public class C03RegEx {
	public static void main(String[] args) {
		// character class (문자분류)
		System.out.println("a".matches("[abc]"));  //true
		System.out.println("b".matches("[abc]"));  //true
		System.out.println("c".matches("[abc]"));  //true
		System.out.println("d".matches("[abc]"));  //false 
		
		
	}
}
