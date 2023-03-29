package ch05.exercise;

public class Example08EnhancedFor {
	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		int sum = 0;
		int count = 0;
		
		for (int[] arr2 : array) {   //2차원 배열을 1차원배열에 넣고  
			for (int n : arr2) {    //1차원 배열을 차례대로 n에 넣음
				sum += n;
				count++;
			}
		}
		//arr2가 {95, 86}일 때 n에 95, 86으로 변하면서 sum에 더해짐
		//arr2가 {83, 92, 96}일 때 n에 83, 92, 96으로 차례대로 변하면서 sum에 더해짐
		// ...
		
		
		System.out.println("전체 합 : " + sum);
		System.out.println("평균 : " + (double) sum / count);
		
		
	}
}
