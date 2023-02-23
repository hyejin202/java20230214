package ch05.lecture.p04string;

public class C02String {
	public static void main(String[] args) {
		String str1 = new String("java");  //new연산자로 문자열 생성
		String str2 = "java";   //new 연산자 생략, 리터럴로 문자열 생성
		String str3 = "java";   //new 연산자 생략, 리터럴로 문자열 생성
		
		System.out.println(str2 == str3);  //true
		System.out.println(str1 == str2);  //false
		
		System.out.println(str1.equals(str2)); //true, 문자열이 같은 지 비교
	}
}
