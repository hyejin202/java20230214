package ch12.sec03.exam03;

public class ToStringExample {
	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("삼성전자", "안드로이드");
		String strObj = myPhone.toString();
		
		System.out.println(strObj);
		System.out.println(myPhone);
	
		System.out.println(System.identityHashCode(strObj));  // 둘이 참조값 다름
		System.out.println(System.identityHashCode(myPhone));		
				
	}
}
