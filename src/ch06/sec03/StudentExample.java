package ch06.sec03;

public class StudentExample {
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println("s1변수가 Student 객체를 참조합니다.");
		
		Student s2 = new Student();
		System.out.println("s2변수가 또 다른 Student 객체를 참조합니다.");
		
		System.out.println(s1 == s2);  //false
		
		//참조값 얻기 : System.identityHashCode()
		System.out.println(System.identityHashCode(s1));  //참조값 출력
	}
}
