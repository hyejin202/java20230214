package ch08.lecture.p05cast;

public class C01Cast {
	public static void main(String[] args) {
		MyInterface01 o1 = new MyClass011();
//		o1.method1();  //XX
		
		//강제형변환
		MyClass011 o2 = (MyClass011) o1;   
		
		o2.method1();
	}
}
