package ch05.lecture.p07arrays;

import java.util.Arrays;

public class C01ToString {
	public static void main(String[] args) {
		int[] arr1 = {8,5,2,5,7};
		
		for (int n : arr1) {
			System.out.println(n);
		}
		//ctrl + shift + o
		System.out.println(Arrays.toString(arr1));
		
		String[] arr2 = {"java", "hello", "spring", "python"};
		System.out.println(Arrays.toString(arr2));
		
	}
}
