package test;

import java.util.*;

public class T01test01 {
	public static void main(String[] args) {
		int[] numlist = new int[] {1, 9, 3, 10, 13, 5};
		
		int n = 5;
		
		 String str = "";
	        for (int i=0; i<numlist.length; i++) {
	            if (numlist[i] % n == 0) {
	                str += numlist[i]+ ",";
	            }
	        }
	        System.out.println(str);
	        
	        String[] strArr = str.split(",");
	        System.out.println(Arrays.toString(strArr));
	        
	        
		
	}
}
