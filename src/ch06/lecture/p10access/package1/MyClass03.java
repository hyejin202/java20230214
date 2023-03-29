package ch06.lecture.p10access.package1;

public class MyClass03 {
	//어디서든지 접근 가능
	public MyClass03() {
		
	}
	//클래스 내에서만 접근 가능
	private MyClass03(int i) {
		
	}
	//작성 패키지 내에서만 접근 가능
	MyClass03(String s) {
		
	}
	
	public void method1() {
		MyClass03 o1 = new MyClass03(3);   //9라인 생성자 사용 가능
	}
	
}
