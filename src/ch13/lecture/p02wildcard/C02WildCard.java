package ch13.lecture.p02wildcard;

public class C02WildCard {
	public static void main(String[] args) {
//		MyClass02<Object> o1 = new MyClass02<String>();  //XX  <Object> -> only Object
		
		//값이 나갈 때(out) super, 프로그램 기준 출력 out
		MyClass02<? super String> o1 = new MyClass02<Object>();  //String의 상위타입
		o1.item = new String();   //String 또는 그 하위타입 대입 가능 (o1은 String이상 타입이므로)
//		o1.item = new Object();   //X 안전하지 않음  (String상위타입 대입 불가, o1이 String일 수 있음)
//		String s1 = o1.item;  //XX String에 할당 불가
		
		
		//값이 들어올 때(in) extends, 프로그램 기준 in
		MyClass02<? extends String> o2 = new MyClass02<String>();   //String의 하위타입
//		o2.item = new String();  //String 또는 그 하위타입을 대입 불가능(o2가  String이하 타입이므로 "하위 = 상위"일 수 있음)
		String s2 = o2.item;  //String에 할당 가능   
		Object oo = o2.item; //String 상위 타입에 할당 가능  (o2는 String이하 타입일 것이므로)
		
		
	}
}

class MyClass02<T> {
	public T item;
}
