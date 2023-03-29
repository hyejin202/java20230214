package ch12.lecture.p06annotation;

import java.lang.annotation.*;

public class C03Annotation {

}
//@MyAnnotation03
class MyClass03{
	@MyAnnotation03
	String field;
//	@MyAnnotation03
	MyClass03() {}
	
//	@MyAnnotation03
	void method3() {}
}
//명시X-> 아무곳에 가능
//@Target(ElementType.TYPE)   //클래스, 인터페이스에만 붙일 수 있음
//@Target(ElementType.METHOD)  //메소드에만 붙일 수 있음
@Target(ElementType.FIELD)  //필드에만 붙일 수 있음

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation03{
	
}
