package ch12.lecture.p06annotation;

public class C07Annotation {
	public static void main(String[] args) {
		
	}
}
class MyClass07 {
	@MyAnnotation07 (value = "hello")  
	String field1;
	@MyAnnotation07("greeting")  //value 글자 생략 가능
	String field2;
	@MyAnnotation07("hi")
	String field3;
}
@interface MyAnnotation07 {
	String value();  //value라는 attribute가 있다면
}