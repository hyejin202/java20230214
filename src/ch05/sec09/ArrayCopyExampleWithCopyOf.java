package ch05.sec09;

import java.util.Arrays;

public class ArrayCopyExampleWithCopyOf {
	public static void main(String[] args) {
		// 188쪽 Arrays.copyOf로 작성해보기

		// 길이 3인 배열
		String[] oldStrArray = { "java", "array", "copy" };
		
		//길이가 5인 배열에 oldStrArray를 복사, 빈공간 null
		String[] newStrArray = Arrays.copyOf(oldStrArray, 5);
		
		// 배열 항목 출력
		for (int i = 0; i < newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ", ");
		}
	}
}
