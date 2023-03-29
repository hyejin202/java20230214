package problem.leetcode;

import java.util.*;

public class Leet1512 {
	 public int numIdenticalPairs(int[] nums) {
		 Map<Integer, Integer> map = new HashMap<>();

		 for(int i=0; i<nums.length; i++) {
			for(int j=i+1; j<nums.length-i-1; j++) {
				if (i == nums.length-1) {
					break;
				}
				if(nums[i] == nums[j]) {
					map.put(i,  j);
				}
			}
		 }
		 System.out.println(map);
		
		 int size = map.size();
		 return size;
	 }
}
