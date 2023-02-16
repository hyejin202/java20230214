package ch02.lecture.p05print;

public class C07Print {
	public static void main(String[] args) {
		int age = 30;
		String name = "son";
		
		System.out.printf("이름은 %s이고 나이는 %d이다", name, age);
		System.out.printf("나이는 %d이고 이름은 %s이다", age, name);
		
		System.out.println();
		System.out.printf("이름은 %2$s이고 나이는 %1$d이다", age, name);
	}
}
