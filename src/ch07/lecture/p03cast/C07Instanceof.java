package ch07.lecture.p03cast;

public class C07Instanceof {
	
	public static void main(String[] args) {
		action(new Animal());
		action(new Horse());
		action(new Fish());
	}
	
	public static void action(Animal a) {
		a.breath();
		
		if(a instanceof Horse) {
			//말이면 run 메소드 실행
			Horse h = (Horse) a;
			h.run();
			
		} else if (a instanceof Fish) {
			//물고기면 swim 메소드 실행
			Fish f = (Fish) a;
			f.swim();
		} else {
			System.out.println("말도 물고기도 아닙니다.");
		}
		
	}
}
