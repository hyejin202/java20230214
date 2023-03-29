package ch11.lecture.p02try_catch;

public class C08MultipleException {
	public static void main(String[] args) {
		try {
			
			//여러 exception 발생 가능
//		}catch (RuntimeException e) {
			// 아래 catch block의 exceptoin보다
			//상위 타입의exception catch block을 먼저 작성할 수 없다
//			e.printStackTrace();    
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (ClassCastException e) {
			e.printStackTrace();
		} catch (Exception e) {   //여러 catch 블럭을 작성할 때 상위타입의 exception은 맨위에 작성X, 아래쪽에 작성
			e.printStackTrace();
		}
		
		System.out.println("continue...");
	}
}
