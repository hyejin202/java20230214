package ch12.sec12;

import java.lang.annotation.*;

@Target({ElementType.METHOD})  //적용대상:METHOD
@Retention(RetentionPolicy.RUNTIME)  //유지정책 : RUNTIME
public @interface PrintAnnotation {
	String value() default "-";   // 선의 종류
	int number() default 15;  //출력 횟수
}
