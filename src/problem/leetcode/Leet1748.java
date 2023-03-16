package problem.leetcode;

import java.util.*;

public class Leet1748 {
	public int sumOfUnique(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int n : nums) {
			if(map.containsKey(n)) {
				int oldValue = map.get(n);
				map.put(n, oldValue + 1);
			} else {
				map.put(n,  1);
			}
		}
		
		
/*		for(int n : nums) {
			map.putIfAbsent(n, 0);        //map에 key 값(n)이 없으면 (n, 0)을 넣어라(map.put(n, 0))
			int oldValue = map.get(n);
			map.replace(n,  oldValue+1);
		}*/
		
		int sum = 0;
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			int v = entry.getValue();
			int k = entry.getKey();
			if (v == 1) {
				sum += k;
			}
		}
		
		
		return sum;
	}
}
