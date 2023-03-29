package ch07.lecture.p09protected.package2;

import ch07.lecture.p09protected.package1.*;

public class OtherPackageClass {
	public void someMethod() {
		Super01 o1 = new Super01();   //클래스는 public 
//		o1.metho1();  //다른패키지에 있기 때문에 안됨, method1->protected
	}
}
