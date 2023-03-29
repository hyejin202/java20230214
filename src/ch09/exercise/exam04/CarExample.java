package ch09.exercise.exam04;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		//인스턴스 멤버 클래스 객체 생성
		Car.Tire tire = myCar.new Tire();
		//정적 멤버 클래스 객체 생성
		Car.Engine engine = new Car.Engine();
	}
}

class Car {
	class Tire {}
	static class Engine {}
}