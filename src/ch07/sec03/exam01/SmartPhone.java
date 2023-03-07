package ch07.sec03.exam01;

public class SmartPhone extends Phone {
	//자식 생성자 선언
	public SmartPhone(String model, String color) {
		super(model, color);  //상위 클래스 생성자 호출
//		this.model = model;     //private이기 떄문에 직접 초기화할 수 없음
//		this.color = color;
		System.out.println("SmartPhone(String model, String color) 생성자 실행됨");
	}
}
