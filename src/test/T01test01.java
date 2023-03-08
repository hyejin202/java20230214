package test;

import java.util.*;

public class T01test01 {
	public static void main(String[] args) {
		
		int[] numlist = new int[] {4, 5, 6, 7, 8, 9, 10, 11, 12};
		int n = 3;
		int len = 0;
        for (int i=0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
               len++;
            }
        }
        System.out.println(len);
//        String[] strArr = str.split(",");
//        int[] answer = new int[strArr.length];
//        for(int i=0; i<answer.length; i++) {
//            answer[i] = Integer.parseInt(strArr[i]);
//        }

	}
}
