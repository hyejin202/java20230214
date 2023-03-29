package ch12.lecture.p02wrapper;

public class C03AutoBoxing {
	public static void main(String[] args) {
		Byte b = 3;
		Short s = 20000;
		Integer i = 200000;
		Long l = 99L;
		Float f = 3.14F;
		Double d = 3.14;
		Character c = '가';
		Boolean bool = true; 
		
		//object에 넣을 수 있음
		Object o1 = b;
		Object o2 = bool;
		//한번에 넣기 가능
		Object o3 = true;
	}
}
