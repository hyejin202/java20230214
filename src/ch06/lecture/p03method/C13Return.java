package ch06.lecture.p03method;

public class C13Return {
	public static void main(String[] args) {
		MyClass13 o1 = new MyClass13();
		int var1 = o1.method1();  //리턴한 값(3)으로 치환
		
		System.out.println(var1);
		
		int var2 = o1.method1() * 2;
		System.out.println(var2);
		
		System.out.println(o1.method1());
		
		String var3 = o1.method2();   //리턴한 값(hello)로 치환
		System.out.println(var3);
		
		String var4 = o1.method2() + " java";
		System.out.println(var4);
		
		System.out.println(o1.method2());
		
		//자동형변환
		int var5 = o1.method1();
//		short var6 = o1.method1();  //short타입으로 받으면 오류
		long var6 = o1.method1(); // long타입 가능
		
		
	}
}
