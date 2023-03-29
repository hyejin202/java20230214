package ch05.lecture.p08regex;

public class C06RegEx {
	public static void main(String[] args) {
		System.out.println("Az".matches("[A-Z][a-z]")); //t
		System.out.println("Bx".matches("[A-Z][a-z]")); //t
		System.out.println("Op".matches("[A-Z][a-z]")); //t
		
		System.out.println("ii".matches("[A-Z][a-z]")); //f
		System.out.println("DD".matches("[A-Z][a-z]")); //f
		
	}
}
