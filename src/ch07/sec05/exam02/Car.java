package ch07.sec05.exam02;

public class Car {
	//필드 선언
	public int speed;
	
	//메소드 선언
	public void speedUp() {
		speed += 1;
	}
	
	//final 메소드
	public final void stop() {   //final public 이라 해도됨(리턴타입 앞에만 작성하면 됨)
		System.out.println("차를 멈춤");
		speed = 0;
	}
}
