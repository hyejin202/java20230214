package ch16.sec05.exam01;

public class MethodReferenceExample {
	public static void main(String[] args) {
		Person person = new Person();
		
		//정적메소드일 경우
		//람다식
		//person.action((x, y) -> Computer.staticMethod(x, y));
		//메소드 참조
		person.action(Computer::staticMethod);   //메소드 참조를 이용해 람다식으로 파라미터에 넣음
		
		//인스턴스 메소드일 경우
		Computer com = new Computer();
		//람다식
		//person.action((x, y) -> com.instanceMethod(x, y));
		//메소드 참조
		person.action(com::instanceMethod);
	}
}
