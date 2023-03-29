package ch12.sec06;

public class BoxingUnBoxingExample {
	public static void main(String[] args) {
		//Boxing
		Integer obj = 100;
		System.out.println("value: " + obj.intValue());  //intValue()메소드 : Integer 객체내부의 int값을 리턴
		
		//Unboxing
		int value = obj;
		System.out.println("value : " + value);
		
		//연산 시 Unboxing
		int result = obj + 100;
		System.out.println("result : " + result);
		
	}
}
