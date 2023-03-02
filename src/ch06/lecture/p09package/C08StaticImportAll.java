package ch06.lecture.p09package;

import static java.lang.Math.*;

public class C08StaticImportAll {
	public static void main(String[] args) {
		
		//주사위 두개 던져 나온 숫자의 합 출력
//		double num1 = Math.floor(Math.random() * 6) + 1;
//		double num2 = Math.floor(Math.random() * 6) + 1;
		
		double num1 = floor(random() * 6) + 1;
		double num2 = floor(random() * 6) + 1;
		
		System.out.println((int)num1);
		System.out.println((int)num2);
	}
}
