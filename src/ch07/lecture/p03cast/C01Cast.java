package ch07.lecture.p03cast;

public class C01Cast {
	public static void main(String[] args) {
		//강제형변환
		Animal a1 = new Horse();
		a1.breath();
//		a1.run();   //XX
		
//		Horse h1 = a1;   // horse is animal (O), animal is horde(x) -강제 형변환 해야 함
		Horse h1 = (Horse) a1;  //강제 형변환
		h1.run();   //ok
		
		Animal a2 = new Fish();
		a2.breath();
//		a2.swim()   //XX
		
		Fish f1 = (Fish) a2;  //강제 형변환 (type casting)
		f1.swim();
		
	}
}

class Animal {
	public void breath() {
		System.out.println("호흡한다.");
	}
}
class Horse extends Animal {
	@Override
	public void breath() {
		System.out.println("폐호흡한다.");
	}
	
	public void run() {
		System.out.println("달립니다.");
	}
}

class Fish extends Animal {
	@Override
	public void breath() {
		System.out.println("아가미호흡한다");
	}
	
	public void swim() {
		System.out.println("헤엄칩니다.");
	}
}