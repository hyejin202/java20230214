package ch06.lecture.p04static;

public class MyClass05 {
	
	//instance field
	String name;
	
	//static field
	static String model;
	
	// instance method
	void printName() {
		System.out.println(model);
		System.out.println(name);
	}
	
	//static method
	static void printModel() {
		System.out.println(model);
//		System.out.println(name);  //static 내부에 instance 접근 불가능
	}
}
