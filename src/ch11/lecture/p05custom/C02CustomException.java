package ch11.lecture.p05custom;

public class C02CustomException {
	public static void main(String[] args) throws Exception{
		Exception e = new Exception();   //파라미터 없는 기본 exception 만들기
		Exception e2 = new Exception("some message");   
		
		System.out.println(e.getMessage());
		System.out.println(e2.getMessage());
		
		throw e2;
	}
}
