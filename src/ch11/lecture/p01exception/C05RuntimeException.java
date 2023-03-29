package ch11.lecture.p01exception;

public class C05RuntimeException {
	public static void main(String[] args) {
		Object s = "java";
		Integer i = (Integer) s;    //강제형변환, ClassCastException - RuntimeException
		
		System.out.println("continue...");
	}
}
