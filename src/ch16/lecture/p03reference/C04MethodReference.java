package ch16.lecture.p03reference;

public class C04MethodReference {
	public static void main(String[] args) {
		//instance method
		//Reference to an instance method
		//of an arbitrary object of a particular type
		
		MyInterface05 o1 = (a, b) -> a.method(b);  //첫번째 파라미터의 메소드에 두번째 파라미터가 매개변수로 들어갈 때
		MyInterface05 o2 = MyClass04::method;
	}
}

//람다가 파라미터가 한개이상일때 엎에 있는 인스턴스의 타입명 :: 인스턴스 메소드


interface MyInterface05 {
	void action(MyClass04 a, int b);
}

class MyClass04 {
	void method(int a) {
		
	}
}
