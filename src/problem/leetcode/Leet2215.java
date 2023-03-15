package problem.leetcode;

import java.util.*;

public class Leet2215 {
	public List<List<Integer>> findDifference(int[] num1, int[] num2) {
		// 코드 작성
/*		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		
		
		for (int i : num1) {
			set1.add(i);
		}
		for (int i : num2) {
			set2.add(i);
		}
		
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();

		list1.addAll(set1);
		list2.addAll(set2);
		
		list1.removeIf(set2::contains);
		list2.removeIf(set1::contains);
		
		return List.of(list1, list2);
		*/
		
		List<List<Integer>> res = new ArrayList<>();
		
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		
		for (int i : num1) {
			set1.add(i);
		}
		for (int i : num2) {
			set2.add(i);
		}
		
		
		
		for(Integer i1 : set1) {
			list1.add(i1);
		}
		for(Integer i2 : set2) {
			list2.add(i2);
		}
		
		for (int n : set2) {	
			list1.removeIf(e -> (e == n));
		}
		for (int m : set1) {
			list2.removeIf(e -> (e == m));
		}
		
		//-------------------------------------
		
//		for (int n : set2) {	
//			set1.removeIf(e -> (e == n));
//		}
//		for (int m : set1) {
//			set2.removeIf(e -> (e == m));
//		}
//		
//		for(Integer i1 : set1) {
//			list1.add(i1);
//		}
//		for(Integer i2 : set2) {
//			list2.add(i2);
//		}
		
		
		res.add(list1);
		res.add(list2);
		
		return res;

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
