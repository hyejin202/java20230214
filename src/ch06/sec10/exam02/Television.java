package ch06.sec10.exam02;

public class Television {
	static String company = "MyCompany";
	static String model = "LCD";
	static String info;
	
	//static initialization block : 스태틱 필드 초기화 (주로)
	static {   //좀 더 복잡한 초기화 -> static block에 작성
		info = company + "-" + model;
	}
}
