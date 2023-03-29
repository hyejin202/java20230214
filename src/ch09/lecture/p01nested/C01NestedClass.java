package ch09.lecture.p01nested;

public class C01NestedClass {
	public static void main(String[] args) {
		MyClass01 o1 = new MyClass01();
		MyClass01.Nested01 o2 = o1.new Nested01();
	}
}

//중첩클래스 (nested class)
class MyClass01 {
	
	// class 
	class Nested01 {  //감싼 클래스의 인스턴스(필드와 메소드가 스태틱이 아닐 경우)를 우선 만들고 접근 가능
		//필드 
		//생성자 
		//메소드
	}
	
	//필드
	//생성자
	//메소드
}