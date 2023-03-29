package ch05.lecture.p07arrays;

import java.util.Arrays;

public class C07CopyMatrix {
	public static void main(String[] args) {
		int[][] arr1 = {
				{5,7,9,10},
				{3,2,1,0}
		};
		
		//깊은 복사 (deep copy) - 참조의 참조까지 복사
		int[][] arr2 = new int[arr1.length][];
		for (int i=0; i<arr1.length; i++) {
			arr2[i] = Arrays.copyOf(arr1[i], arr1[i].length);
		}
		
		for (int i=0; i<arr2.length; i++) {
			System.out.println(Arrays.toString(arr2[i]));
		}
		
		arr1[0][0] = 50;
		System.out.println(arr1[0][0]);
		System.out.println(arr2[0][0]);
	}
}
