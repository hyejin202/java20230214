package ch02.lecture.p05print;

public class C09Print {
	public static void main(String[] args) {
		//width를 출력할 때 차지할 문자칸 수 
		System.out.printf("%d%n", 300);
		System.out.printf("%5d%n", 300);
		System.out.printf("%10d%n", 300);
		
		
		System.out.printf("%8s%n", "hi");
		System.out.printf("%6s%n", "hello world");
		System.out.printf("%6d%n", 300300300);
		
		int age = 33;
		String name = "son";
		
		System.out.printf("나이는 %2$3d이고 이름은 %1$10s입니다.", name, age);
	}
}
