package ch05.lecture.p07arrays;

import java.util.Arrays;

public class C03CopyOf {
	public static void main(String[] args) {
		int[] arr1 = {2, 3, 7, 6, 9};
		
		// 파라미터 : 원본배열, 타겟배열길이
		int[] arr2 = Arrays.copyOf(arr1,  arr1.length);
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		arr1[0] = 33;
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
	}
}
