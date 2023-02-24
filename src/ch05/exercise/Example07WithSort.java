package ch05.exercise;

import java.util.Arrays;

public class Example07WithSort {
	public static void main(String[] args) {
		// 아래 배열에서 가장 큰 값을 찾아 출력
		int[] array = {1,5,3,8,2};
		
		Arrays.sort(array);
		System.out.println(array[array.length-1]);
		
	}
}
