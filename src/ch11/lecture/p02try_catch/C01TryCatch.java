package ch11.lecture.p02try_catch;

public class C01TryCatch {
	public static void main(String[] args) {
		
		try {   // exception이 발생할 수 있는 코드 작성
			int a = 0;
			int b = 3;
		
			int c = b / a;			
		} catch (ArithmeticException e) {   //e : ArithmeticException타입의 변수명, 예외가 발생하면 예외를 잡기 위해 catch문 실행
			// 발생한 exception을 잡아서 실행하는 코드 (던진걸(throw) 잡음)  
//			e.printStackTrace();
			
			System.out.println(2);
		}
		
		System.out.println("continue...");
		
		
		
		
	}
}
