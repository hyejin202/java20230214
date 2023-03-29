package ch13.exercise.exam07;

public class MathMax {
	public static void main(String[] args) {
		//5장 확인문제 7번
		//주어진 배열 항목에서 최댓삾 출력
		//Math.max() 사용
		int[] array = {1, 5, 3, 8, 2};
		
		int max = Integer.MIN_VALUE;
//		for (int i=0; i<array.length; i++) {
//			if (Math.max(array[i], max) == array[i]) {
//				max = array[i];
//			}
//			
//		}
		for (int n : array) {
			max = Math.max(max, n);
		}
		System.out.println(max);
		
	}
}
