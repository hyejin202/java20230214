package ch06.sec13.exam03.package1;

public class B {
	public void method() {
		//객체 생성
		A a = new A();
		
		//필드값 변경
		a.field1 = 1;  // (O) public
		a.field2 = 1;  // (O) default
//		a.field3 = 1;  // (X)  private
		
		//메소드 호출
		a.method1();  // (O) public 
		a.method2();  // (O) default
//		a.method3();  // (X) private
	}
}
