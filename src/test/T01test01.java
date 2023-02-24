package test;

import java.util.Arrays;

public class T01test01 {
	public static void main(String[] args) {
		int n = 10;
		int len = 0;
		for (int i = 0; i < n; i++) {
			if (i%2 == 1) {
				len++;
			}
		}

		int[] answer = new int[len];

		for (int i = 1; i < n/2+1; i++) {
			answer[i - 1] = 2 * i - 1;
		}
		System.out.println(Arrays.toString(answer));
	}
}
