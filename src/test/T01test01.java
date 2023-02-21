package test;

import java.util.Scanner;

public class T01test01 {
	public static void main(String[] args) {
		String a = "Hiabcx";
		String b = "bc";
		String str1 = a.toLowerCase();
		String str2 = b.toLowerCase();
		boolean res;

		if (str1.contains(str2) || str2.contains(str1)) {
			res = true;
		} else {
			res = false;
		}
		System.out.println(res);
	}
}
