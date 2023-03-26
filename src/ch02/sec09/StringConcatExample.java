package ch02.sec09;

public class StringConcatExample {
	public static void main(String[] args) {
		//숫자 연산
		int res1 = 10 + 2 + 8;
		System.out.println("res1: " + res1);
		
		//결합 연산
		String res2 = 10 + 2 + "8";
		System.out.println("res2: " + res2);
		
		String res3 = 10 + "2" + 8;
		System.out.println("res3: " + res3);
		
		String res4 = "10" + 2 + 8;
		System.out.println("res4: " + res4);
		
		String res5 = "10" + (2 + 8);
		System.out.println("res5: " + res5);
	}

}
