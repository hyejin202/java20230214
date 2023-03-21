package test;

import java.util.*;

public class T01test01 {
	public static void main(String[] args) {
		System.out.println("1");
//		*
//		**
//		***
//		****
//		*****
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("2");
//		*****
//		****
//		***
//		**
//		*
		for(int i=0; i<5; i++) {
			for(int j=5; j>i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("3");
//		 	*
//		   **
//		  ***
//		 ****
//		*****
		
		
		System.out.println();
		System.out.println("4");
//		*****
//		 ****
//		  ***
//		   **
//		    *
		
		System.out.println();
		System.out.println("5");
//		*
//		**
//		***
//		****
//		*****
//		****
//		***
//		**
//		*
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0; i<5; i++) {
			for(int j=5; j>i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println("6");
//		  	 *  
//		    ***
//		   *****
//		  *******
//		 *********
		for(int i=0; i<5; i++) {
			for(int j=1; j<(2*j)+1; j+=2) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println("7");
//			*
//		   ***
//		  *****
//		 *******
//		  *****
//		   ***
//		    *
	}
}
