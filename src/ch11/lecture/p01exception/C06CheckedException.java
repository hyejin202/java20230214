package ch11.lecture.p01exception;

public class C06CheckedException {
	public static void main(String[] args) {
		//exception이 발생할 수 있으니 변경하라고 컴파일러가 체크해줌
//		Class.forName("java.lang.Object");   //ClassNotFoundException - 일반예외
		
		
		try {
			Class.forName("java.lang.Object");  
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("continue...");
	}
}
