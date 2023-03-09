package test;

import java.util.*;

public class T01test01 {
	public static void main(String[] args) {
		int[] array = new int[] {1, 8, 3};
		int[] answer = new int[2];
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<array.length; i++) {
			if (array[i] > max) {
				max = array[i];
				answer[0] = max;
				answer[1] = i;
			}
			
			}
		System.out.println(Arrays.toString(answer));
		
	}
}
