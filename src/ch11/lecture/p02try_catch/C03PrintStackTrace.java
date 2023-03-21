package ch11.lecture.p02try_catch;

public class C03PrintStackTrace {
	public static void main(String[] args) {
		try {
			int a = 0;
			int b = 3;
			int c = b / a;
			
			System.out.println("try block continue...");
		} catch (ArithmeticException e1) {
			//catch block
			//예외가 발생했다면 발생했다는 흔적을 남기면 좋음 (아무것도 작성하지 않으면 나중에 돌아와 고치기 어려움)
//			System.out.println("예외 발생!!!");
			e1.printStackTrace();  //exception 정보를 담고 있음, 웬만하면 예외발생 시 작성
		}
		
		System.out.println("program continue...");
	}
}
