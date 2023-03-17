package ch17.lecture.p02terminal;

import java.util.*;

public class C08MaxMin {
	public static void main(String[] args) {
		//IntStream 은 기본타입을 원소로 가지는 stream이기 때문에 각 원소 비교 가능, 파라미터 없이 max() 사용 가능
		
		int[] arr = { 3, 5, 8, 7, 9 };
		
		int max = Arrays.stream(arr)
				.max()
				.getAsInt();
		System.out.println(max);
		int min = Arrays.stream(arr)
				.min()
				.getAsInt();
		System.out.println(min);
	
	}
}
