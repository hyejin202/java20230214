package ch12.lecture.p02wrapper;

public class C07UnBoxing {
	public static void main(String[] args) {
		Integer i1 = 30000;
		
		int r1 = i1 + 50000;
		
		System.out.println(r1);
		
		Object o1 = 30000;  //auto boxing, type conversion
		
//		int r2 = o1 + 50000;  //XXX
		int r3 = ((Integer) o1) + 50000; //강제타입변환, 위험한 코드
		int r4 = ((int) o1) + 50000;
		System.out.println(r3);
		System.out.println(r4);
		
	}
	
}
