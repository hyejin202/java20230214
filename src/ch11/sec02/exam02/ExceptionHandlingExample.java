package ch11.sec02.exam02;

public class ExceptionHandlingExample {
	public static void main(String[] args) {
		try {
			Class.forName("java.lang.String");  //지정한 클래스가 있으면 그 클래스의 정보를 담은 클래스를 리턴, 없으면 예외 발생 시킴
			System.out.println("java.lang.String 클래스가 존재합니다.");  //클래스 존재, 예외발생X
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println();
		
		try {
			Class.forName("java.lang.String2");    //클래스 존재X, 예외발생
			System.out.println("java.lang.String2 클래스가 존재합니다.");  
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
