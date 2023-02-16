package ch03.sec02;

public class OverflowUnderflowExample {
	public static void main(String[] args) {
		byte var1 = 125;
		for (int i = 0; i < 5; i++) {
			var1++;
			System.out.println("var1: " + var1);
		}
		//최대허용값 벗어남 - overflow
		
		System.out.println("-----------------------");
		
		byte var2 = -125;
		for (int i = 0; i < 5; i++) {
			var2--;
			System.out.println("var2: " + var2);
		}
		//최소허용값 벗어남 - underflow
	}
}
