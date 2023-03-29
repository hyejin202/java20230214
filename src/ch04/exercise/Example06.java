package ch04.exercise;

public class Example06 {
	public static void main(String[] args) {
		//1
		String star = "";
		for (int i = 1; i <= 5; i++) {
			star += "*";
			System.out.println(star);
		}
		
		System.out.println();
		
		//2
		for (int m=0; m<5; m++) {
			for (int n=0; n<=m; n++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
