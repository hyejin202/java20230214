package ch06.lecture.p08static;

public class MyClass01 {
	//필드
	//인스턴스 필드
	String name;
	
	// 정적(static) 필드
	static String company;
	
	//생성자 : 인스턴스 필드 초기화 (주로)
	MyClass01() {
		name = "son";
	}
	
	//static block : 스태틱 필드 초기화 (주로)
	static {
		//명령문들...
		company = "samsung";
	}
	
}
