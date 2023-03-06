package test;

import java.util.*;

public class T01test01 {
	public static void main(String[] args) {
		int[] numbers = new int[] { 1, 2, 3 };
		int[] answer = new int[numbers.length];
		String direction = "right";
		switch (direction) {
		case "right" -> {
			for (int i = 0; i < numbers.length; i++) {
				if (i == numbers.length - 1) {
					answer[0] = numbers[numbers.length - 1];
				} else {
					answer[i + 1] = numbers[i];
				}
			}
		}
		case "left" -> {
			for (int i = 0; i < numbers.length; i++) {
				if (i == 0) {
					answer[numbers.length - 1] = numbers[0];
				} else {
					answer[i - 1] = numbers[i];
				}
			}
		}
		}
		System.out.println(Arrays.toString(answer));
	}
}
