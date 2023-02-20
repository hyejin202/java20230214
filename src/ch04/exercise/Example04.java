package ch04.exercise;

public class Example04 {
	public static void main(String[] args) {
		//do while
		int dice1, dice2;
		do {
			dice1 = (int) (Math.random()*6) + 1;
			dice2 = (int) (Math.random()*6) + 1;
			
			System.out.printf("(%d, %d)\n", dice1, dice2);
			
		} while (dice1+dice2 != 5);
		
		//while
//		int dice1, dice2;
//		boolean con = true;
//		while(dice1+dice2 != 5) {
//			dice1 = (int) (Math.random()*6) + 1;
//			dice2 = (int) (Math.random()*6) + 1;
//			
//			System.out.printf("(%d, %d)\n", dice1, dice2);
//		}
		
		
		
		
	}
}
