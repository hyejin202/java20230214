package ch16.sec05.exam02;

public class MethodReferenceExample {
	public static void main(String[] args) {
		Person person = new Person();
		person.ordering(String :: compareToIgnoreCase);    //메소드 참조  (a, b) -> a.compareToIgnoreCase(b)
		
		//람다식을 파라미터로 갖음 -> functional interface 객체가 있음
	}
}
