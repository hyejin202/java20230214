package ch11.lecture.p02try_catch;

public class C06MultipleException {
	public static void main(String[] args) {
		try {
			int[] a = { 0, 1 };

			// ArithmeticException
			// ArrayIndexOutOfBoundsException

			int c = 3 / a[0];
 
		} catch (RuntimeException e) {   //상위 타입으로 작성 가능
			e.printStackTrace();
		}

		System.out.println("continue...");
	}

}
