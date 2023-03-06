package ch07.lecture.p05polymorphism;

public class C01Polymorphsm {
	public static void main(String[] args) {
		//Integer-> Number-> Object
		Integer i1 = new Integer(33);  //deprecated 중요도가 떨어져 사용권장하지 않음
		Integer i2 = new Integer("33");
		
		Number n1 = i1;
		Number n2 = i2;
		
		Object o1 = i1;
		Object o2 = i2;
		
//		Number n3 = new Number(); //X
		
		
		
	}
}
