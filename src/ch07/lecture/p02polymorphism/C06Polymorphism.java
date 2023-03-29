package ch07.lecture.p02polymorphism;

public class C06Polymorphism {
	public static void main(String[] args) {
		
	}
	public static Gun getGun() {
		// ...
		
		return new Gun();   //Gun타입 리턴해야 함
	}
	
	public static Bow getBow() {
		// ...
		Bow b = new Bow();
		return b;   //Bow타입 리턴해야 함
	}
	
	public static Weapon getWeapon() {
		// ...
		/*   //(O)
		Weapon w1 = new Weapon();   
		return w1;
		*/
		/*
		Gun gun = new Gun();
		return gun;
		*/
		Bow bow = new Bow();
		return bow;
	}
}
