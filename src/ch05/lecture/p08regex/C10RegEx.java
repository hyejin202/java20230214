package ch05.lecture.p08regex;

public class C10RegEx {
	public static void main(String[] args) {
		// quantifier (수량자)
		
		//숫자 3개인가?
		//true
		System.out.println("010".matches("[0-9][0-9][0-9]"));
		System.out.println("123".matches("[0-9]{3}"));
		//false
		System.out.println("12".matches("[0-9]{3}"));
		System.out.println("1233".matches("[0-9]{3}"));
		System.out.println("abo".matches("[0-9]{3}"));
	}
}
