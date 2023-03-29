package ch07.sec04.exam02;

public class SuperSonicAirplaneExample {
	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeOff();
		sa.fly();
		sa.flyModel = SupersonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flyModel = SupersonicAirplane.NORMAL;
		sa.fly();
		sa.land();
	}
}
