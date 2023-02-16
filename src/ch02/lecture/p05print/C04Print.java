package ch02.lecture.p05print;

public class C04Print {
	public static void main(String[] args) {
		//아규먼트는 순서대로 적용됨
		System.out.printf("%d %d%n", 3, 100);
		
		System.out.printf("%d %f %n", 3, 2.05);
		
		System.out.printf("%f, %d, %s", 3.14, 9, "안녕"); //순서대로 형식에 맞춰 작성해야 함
		
	}
}
