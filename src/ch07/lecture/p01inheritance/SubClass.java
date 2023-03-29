package ch07.lecture.p01inheritance;

public class SubClass extends SuperClass{
	
	//method1, method2 상속받음
	
	//상속받은 메소드 재정의(overriding) 가능
	public void method2() {
		System.out.println("서브클래스 메소드2");
	}
	public void method3() {
		System.out.println("서브클래스 메소드3");
	}
}
