package ch05.lecture.p07arrays;

import java.util.Arrays;

public class C09Sort {
	public static void main(String[] args) {
		// sort : 정렬
		// 비교가 가능하다면 정렬 가능 (실수, 문자열, ...)
		int[] arr1 = {9, 0, 3, 4, 6, -1};
		
		System.out.println(Arrays.toString(arr1));
		
		//정렬 (오름차순)
		Arrays.sort(arr1);
		
		System.out.println(Arrays.toString(arr1));
		
		// string
		String[] arr2 = {"java", "hello", "css", "friday", "CSS", "안녕", "Css"};
		
		//정렬 전
		System.out.println(Arrays.toString(arr2));
		
		//정렬 후, 유니코드 순(대문자가 앞)
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
	}
}
