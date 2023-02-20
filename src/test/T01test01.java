package test;

import java.util.Scanner;

public class T01test01 {
	public static void main(String[] args) {
		int order = 29423;
		int clap=0;
		
		while (order !=0) {
			int right = order%10;
			
			clap += switch(right) {
			case 3,6,9 -> 1;
			default -> 0;
			};
			order /= 10;
		}
		
		System.out.println(clap);
	}
}
