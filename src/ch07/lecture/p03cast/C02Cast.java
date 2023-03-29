package ch07.lecture.p03cast;

public class C02Cast {
	public static void main(String[] args) {
		Super02 o1 = new Sub02();
		Sub02 o2 = (Sub02) o1;
		
		Super02 o3 = new Super02();
		Sub02 o4 = (Sub02) o3;  //문법오류는 아니지만 실행 안됨(exception발생), 위험한 코드
 		
		System.out.println("실행코드 이어짐...");
	}
}

class Super02 {
	
}
class Sub02 extends Super02 {
	
}
