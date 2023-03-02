package ch06.lecture.p07constructor;

public class MyClass08 {
	//필드
	String name;
	int age;
	String BirthDate;
	boolean married;
	
	//생성자 오버로딩
	MyClass08(String name, int age, boolean married) {
		this.name = name;
		this.age = age;
		this.married = married;
	}
	
	MyClass08(String name, int age, String BirthDate, boolean married) {
		this.name = name;
		this.age  = age;
		this.BirthDate = BirthDate;
		this.married = married;
	}
}
