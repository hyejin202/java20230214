package problem.leetcode;

import java.util.*;

public class Leet2206 {
	public boolean divideArray(int[] nums) {
		
		Map<Integer, Integer> map = new HashMap<>();   // <각 값, 몇개있는지>
		
		for(int n : nums) {
			
			if(map.containsKey(n)) {
				int oldValue = map.get(n);   //get : key값으로 value를 얻음
				map.put(n,  oldValue + 1);
			} else {
				map.put(n,  1);
			}
			
		}
		//value가 홀수인게 한개라도 있으면 false 리턴
//		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
//			int v = entry.getValue();  //getValue() : entry 메소드
//			if(v % 2 ==1) {
//				return false;
//			}
//		}
//
//		return true;
		
		return map.values()
				.stream()
//				.allMatch(e -> (e%2==0));
				.allMatch(this::even);
	}
	private boolean even(int e) {
		return (e%2) == 0;
	}
}
