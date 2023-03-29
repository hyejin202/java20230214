package ch05.exercise;

public class Example07 {
	public static void main(String[] args) {
		// 주어진 배열 항목에서 최댓값 출력
		int[] array = {1, 5, 3, 8, 2};
		
//		int max = array[0];  //초기값을 0으로 두면 음수만 있는 배열에서 최댓값 0 출력
		int max = Integer.MIN_VALUE; //가장 작은수
		
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		System.out.println("최댓값: " + max);
	
	}
}
