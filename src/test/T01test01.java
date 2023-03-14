package test;

import java.util.*;

public class T01test01 {
	public static void main(String[] args) {
		int[] array = new int[] {1, 2, 7, 10, 11};
		        int answer = 0;
		        Arrays.sort(array);
		        answer = array[array.length / 2];
		      
		        System.out.println(answer);
		    }
        
	}
