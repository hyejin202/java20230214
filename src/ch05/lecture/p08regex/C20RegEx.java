package ch05.lecture.p08regex;

import java.util.Arrays;

public class C20RegEx {
	public static void main(String[] args) {
		String str1 = " al as al   alsd   dsa a fadsksdl  as";
		String str2 = str1.replaceAll("\\s+", "");
		
		System.out.println(str1);
		System.out.println(str2);
		
		String str3 = "askdla    ,     salkd,poska    ,  oosa";
		String[] str4 = str3.split("\s*,\s*");
		String str5 = str3.replaceAll("\\s+", "");
		
		System.out.println(Arrays.toString(str4));
		System.out.println(str5);
		
	}
}
