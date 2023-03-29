package ch12.lecture.p06annotation;

public class C01Annotation {
	
}
@MyAnnotation01
class MyClass {  //클래스
	@MyAnnotation01
	String field;  //필드
	
	@MyAnnotation01
	MyClass() {}  //생성자
	
	@MyAnnotation01
	void method1() {  //메소드
		
		//지역변수
		@MyAnnotation01
		int var;
	}
	void method2(@MyAnnotation01 int param) {}  //파라미터
}

@interface MyAnnotation01 {
	
}
