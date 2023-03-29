package ch05.lecture.p08regex;

public class C11RegEx {
	public static void main(String[] args) {
		// 010으로 시작하고, -기호, 숫자 4개, -기호, 숫자 4개 (전화번호 패턴인지)
		
		String pattern = "010-[0-9]{4}-[0-9]{4}";
		System.out.println("010-9999-7777".matches(pattern)); //true
		System.out.println("010-9123-5468".matches(pattern)); //true
		System.out.println("010-456872354".matches(pattern)); //false
		System.out.println("010-9999-777".matches(pattern)); //false
		
	}
}
