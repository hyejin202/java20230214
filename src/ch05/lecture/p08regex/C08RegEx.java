package ch05.lecture.p08regex;

public class C08RegEx {
	public static void main(String[] args) {
		System.out.println("a".matches("[a-zA-Z0-9]")); //t
		System.out.println("z".matches("[0-9a-zA-Z]")); //t
		System.out.println("5".matches("[0-9a-zA-Z]")); //t
		//true
		System.out.println("010".matches("[0-9a-zA-Z][0-9a-zA-Z][0-9a-zA-Z]"));
		System.out.println("abc".matches("[0-9a-zA-Z][0-9a-zA-Z][0-9a-zA-Z]"));
		System.out.println("az3".matches("[0-9a-zA-Z][0-9a-zA-Z][0-9a-zA-Z]"));
	}
}
