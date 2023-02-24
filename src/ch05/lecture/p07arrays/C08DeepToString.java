package ch05.lecture.p07arrays;

import java.util.Arrays;

public class C08DeepToString {
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5};
		
		System.out.println(Arrays.toString(arr1));
		
		int[][] arr2 = {
				{7,8},
				{1,2}
		};
		
		System.out.println(arr2[0]);
		System.out.println(Arrays.toString(arr2));
		
		System.out.println("for loop로 toString");
		for (int[] arr : arr2) {
			System.out.println(Arrays.toString(arr));
		}
		System.out.println("deeptoString 메소드 사용");
		System.out.println(Arrays.deepToString(arr2));
	}
}
