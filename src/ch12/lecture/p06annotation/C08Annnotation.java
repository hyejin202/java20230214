package ch12.lecture.p06annotation;

public class C08Annnotation {
	public static void main(String[] args) {
		
		
		
		
	}
}
class MyClass08{
	@MyAnnotation08
	int f1;
	@MyAnnotation08(100)
	int f2;
	@MyAnnotation08(value = 100)
	int f3;
	@MyAnnotation08(value = 100, name = "lee") //여러 attribute를 적을 때는 'value'생략X
	int f4;
}

@interface MyAnnotation08 {
	int value() default 0;
	String name() default "kim";
	int age() default 0;
}
