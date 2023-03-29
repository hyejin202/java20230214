package ch11.lecture.p01exception;

public class C03RuntimeException {
	public static void main(String[] args) {
		String a = null;
		
		System.out.println(a.length());  //NullPointerException - 실행예외
		
		System.out.println("continue...");
	}
}
