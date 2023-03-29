package ch06.lecture.p03method;

public class C07OverLoading {
	public static void main(String[] args) {
		MyClass07 o1 = new MyClass07();
		
		o1.method1(9);
		o1.method1(298456L);
		o1.method(0, 10);
		o1.method(4, null);
		o1.method("java", 9);
	}
	
}
