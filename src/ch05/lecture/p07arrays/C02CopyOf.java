package ch05.lecture.p07arrays;

import java.util.Arrays;

public class C02CopyOf {
	public static void main(String[] args) {
		int[] arr1 = {3, 36, 7, 4, 9};
		
		int[] arr2 = new int[arr1.length];  //새로운 인스턴스를 만듦
		for (int i =0; i<arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
	}
}
