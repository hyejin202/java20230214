package ch07.sec10.exam01;

public abstract class Phone {
	//필드선언
	String owner;
	
	Phone(String owner) {
		this.owner = owner;
	}
	void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
}

