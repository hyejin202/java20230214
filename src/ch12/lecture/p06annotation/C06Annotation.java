package ch12.lecture.p06annotation;

public class C06Annotation {
	public static void main(String[] args) {
		
	}
}

class MyClass06 {
	@MyAnnotation06  //작성 안하면 기본값, 기본값을 없는 annotation은 작성해야 함
	String field1;
	@MyAnnotation06(myAttr = 10)
	int field2;
	@MyAnnotation06(myAttr = 20)
	boolean field3;
}

@interface MyAnnotation06 {
	int myAttr() default 0;  //기본값을 0으로 줌
}