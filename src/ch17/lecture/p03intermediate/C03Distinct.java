package ch17.lecture.p03intermediate;

import java.util.*;

public class C03Distinct {
	public static void main(String[] args) {
		// distinct 중간연산 : 중복제거
		List<Integer> list = List.of(3, 1, 2, 0, 1, 2, 3);
		
		long cnt = list.stream()
				.count();
		System.out.println(cnt);  //7
		
		long cnt2 = list.stream().distinct().count();
		System.out.println(cnt2);  //4, 중복제거됨
		
		
	}
}
