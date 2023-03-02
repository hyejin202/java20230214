package ch06.lecture.p07constructor;

public class C08Overloading {
	public static void main(String[] args) {
		MyClass08 o1 = new MyClass08("son", 30, "12-11",false);
		
		MyClass08 o2 = new MyClass08("park", 55, null, false);
		o2.BirthDate = "02-03";
		
		MyClass08 o3 = new MyClass08("cha", 77, true);
		o2.BirthDate = "09-11";
	}
}
