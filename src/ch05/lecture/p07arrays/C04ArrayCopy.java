package ch05.lecture.p07arrays;

import java.util.Arrays;

public class C04ArrayCopy {
	public static void main(String[] args) {
		// 책 188쪽
		int[] orign = {1,2,3,4,5};
		int[] target = new int[orign.length];
		
		// 파라미터 : 원본배열, 원본배열 시작위치, 타겟배열, 타겟배열 시작위치, 복사할 길이
		System.arraycopy(orign, 0, target, 1, 2);
		
		System.out.println(Arrays.toString(orign));
		System.out.println(Arrays.toString(target));
		
		orign[0] = 99;
		
		System.out.println(Arrays.toString(orign));
		System.out.println(Arrays.toString(target));
	}
}
