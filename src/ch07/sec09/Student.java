package ch07.sec09;

public class Student extends Person {
	//필드 선언
	public int studentNo;
	
	//생성자 선언
	public Student(String name, int studentNo) {
		super(name);      //super() : 자식클래스의 생성자에서 부모 클래스의 생성자를 호출해줌
		this.studentNo = studentNo;
	}
	//메소드 선언
	public void study() {
		System.out.println("공부를 합니다.");
	}
}
