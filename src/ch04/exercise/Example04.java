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
		
		System.out.println();
		
		//while
		
		int num1, num2;
		while(true) {
			num1 = (int) (Math.random()*6) + 1;
			num2 = (int) (Math.random()*6) + 1;
			
			System.out.printf("(%d, %d)\n", num1, num2);
			
			if (num1+num2 == 5) {
				break;	
			}
		}

		
	}
}
