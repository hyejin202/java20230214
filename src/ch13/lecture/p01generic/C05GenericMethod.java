package ch13.lecture.p01generic;

public class C05GenericMethod {
	public static void main(String[] args) {
		MyClass05 o1 = new MyClass05();
		o1.<String>method("java");  //파라미터 타입으로 <String> 유추-> 생략
		o1.<Integer>method(9);
		
		o1.method("spring");
		o1.method(99);
		
		
	}
}

class MyClass05 {
	//generic method
	public <T> void method(T t) {
		
	}
}