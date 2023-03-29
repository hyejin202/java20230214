package ch07.sec04.exam01;

public class ComputerExample {
	public static void main(String[] args) {
		int r = 10;
		
		Calculator calculator = new Calculator();
		System.out.println("원 면적: " + calculator.areaCircle(r));
		System.out.println();
		
		Computer computer = new Computer();  //어떤 설계도(클래스)로 인스턴스 만들었는지가 중요
		System.out.println("원 면적: " + computer.areaCircle(r));
	}
}
