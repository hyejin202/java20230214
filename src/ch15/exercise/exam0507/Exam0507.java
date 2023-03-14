package ch15.exercise.exam0507;

import java.util.*;

public class Exam0507 {
	public static void main(String[] args) {
//		int[] array = new int[] {1, 5, 3, 8, 2};  
		
		//of : 수정 불가 리스트 리턴
		List<Integer> list = List.of(1, 5, 3, 8, 2);   
		
		
		//위 리스트에서 최대값 구하는 코드 작성
		int max = Integer.MAX_VALUE;
		for(int m :  list) {
			max = Math.max(max, m);
		}
		System.out.println(max);
		
		
		
 	}
}
