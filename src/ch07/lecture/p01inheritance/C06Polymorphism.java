package ch07.lecture.p01inheritance;

public class C06Polymorphism {
	public static void main(String[] args) {
		Sub06 o1 = new Sub06();
		
		Super06 o2 = o1; // ok
		
		Super06 o3 = new Sub06();  //ok
		
		Super06 o4 = new Super06();  //ok
//		Sub06 05 = o4;  //XX
//		Sub06 o6 = new Super06(); // XX
		
	}
}
