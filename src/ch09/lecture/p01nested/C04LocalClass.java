package ch09.lecture.p01nested;

public class C04LocalClass {
	public static void main(String[] args) {
		
	}
	
	void method1() {
		//로컬 클래스 (local class)
		class LocalClass1 {
			
		}
		LocalClass1 o1 = new LocalClass1();
		
	}
	
	void method2() {
//		LocalClass1 o1 = new LocalClass1();  //X
	}
}
