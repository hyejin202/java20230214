package ch06.sec13.exam03.package2;

import ch06.sec13.exam03.package1.*;

public class C {
	public C() {
		//객체생성
		A a = new A();
		
		//필드값 변경
		a.field1 = 1;  // (O) public
//		a.field2 = 1;  // (X) default
//		a.field3 = 1;  // (X) private
		
		//메소드 호출
		a.method1();  // (O) public
//		a.method2();  // (X) default
//		a.method3();  // (X) private
	}
}
