package ch04.lecture.p05break;

public class C02Break {
	public static void main(String[] args) {
		// 4x + 5y = 60
		// 해가 되는 (x, y) 출력
		//하나만 찾아라
		
		outerloop : for(int i=0; i<=10; i++) {
			
			for(int j=0; j<=10; j++) {
				
				int r = (4*i) + (6*j);
				
				if(r == 60) {
					System.out.printf("%d, %d\n", i, j);
					break outerloop;
				}
				
			}
		}
	}
	
}
