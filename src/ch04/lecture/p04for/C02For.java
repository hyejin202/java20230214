package ch04.lecture.p04for;

public class C02For {
	public static void main(String[] args) {
		// 변수 scope
		
				int i = 0;
				while (i < 3) {
					System.out.println("while loop");
					i++;
				}
				
				for (int j = 0; j < 3; j++) {
					System.out.println("for loop");
				}
				
				System.out.println(i);  
//				System.out.println(j);  //j는 for문 내에서만 사용 가능
				
				int j;
				for (j=0; j<3; j++) {
					System.out.println("j");
				}
	}
}
