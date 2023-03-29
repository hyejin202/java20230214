package ch11.lecture.p04throw;

public class C05Throw {
	public static void main(String[] args) {
		
		
	}
	public static void method2() throws Throwable{   //던지는 객체 타입의 상위 클래스 작성 가능
 		throw new ClassNotFoundException();
	}
	public static void method1() throws RuntimeException {    //throws ClassCastException
		throw new ClassCastException();
	}
}
