package ch07.lecture.p02polymorphism;

public class C01Polymorphism {
	public static void main(String[] args) {
		SubClass01 o1 = new SubClass01();
		o1.method1();  //sub method
		SuperClass01 o2 = o1;  //참조값이 같음
		o2.method1();  //sub method
		SuperClass01 o3 = new SuperClass01();
		o3.method1();  //super method
		
	}
}

class SuperClass01 {
	public void method1() {
		System.out.println("super method1");
	}
}

class SubClass01 extends SuperClass01 {
	@Override
	public void method1() {
		System.out.println("sub method1");
	}
}