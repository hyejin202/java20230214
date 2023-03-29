package ch12.lecture.p05reflection;

import java.lang.reflect.*;

public class C02Reflection {
	public static void main(String[] args) {
		Class class1 = String.class;
		
		//class1이라는 클래스 객체를 통해 클래스의 관한 정보를 알 수 있다.
		
		// 이름 (full name)
		System.out.println(class1.getName());  //java.lang.String
		
		// 이름 (simple)
		System.out.println(class1.getSimpleName());  //String

		// 패키지
		System.out.println(class1.getPackageName());  //java.lang
		 
		// 생성자
		Constructor[] constructors = class1.getConstructors();
		
		// 필드
		Field[] fields = class1.getFields();
		
		// 메소드
		Method[] methods = class1.getMethods();
		
		
		
		
	}
}
