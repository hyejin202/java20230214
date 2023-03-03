package ch07.lecture.p01inheritance;

public class C01Inheritance {
	public static void main(String[] args) {
		MyClass02 o1 = new MyClass02();
		o1.field1 = "abc";   //상속받았기 때문에 field1,2 사용 가능
		o1.field2 = 5;
		
		MyClass01 o2 = new MyClass01();
		o2.method1();
		o2.method2();
		
		MyClass02 o3 = new MyClass02();  //사용 가능
		o3.method1();
		o3.method2();
		
	}
}
