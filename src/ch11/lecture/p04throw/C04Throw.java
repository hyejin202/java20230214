package ch11.lecture.p04throw;

public class C04Throw {
	public static void main(String[] args) {
		try {
			method1();
		}catch (RuntimeException e) {
			e.printStackTrace();
		}
		System.out.println("continue...");
		
	}
	
	public static void method1() throws RuntimeException { 
		throw new RuntimeException();
	} 
	//unchecked exception이기 때문에 메소드에 던지는 객체타입 작성 생략가능
	public static void method2() {  
		throw new RuntimeException();
	}
}
