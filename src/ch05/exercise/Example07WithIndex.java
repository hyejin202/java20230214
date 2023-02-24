package ch05.exercise;

public class Example07WithIndex {
	public static void main(String[] args) {
		//최댓값과 최댓값의 인덱스 구하기
		// 인덱스를 구해야 하므로 foreach사용 X
		
		int[] array = {1, 5, 3, 8, 2};
		int index=0;
		
		int max = Integer.MIN_VALUE;
		for (int i=0; i<array.length; i++) {
			if (max < array[i]) {
				max = array[i];
				index = i;
			}
		}
		System.out.println("최댓값 : " + max);
		System.out.println("최댓값 인덱스 : " + index);
	}
}
