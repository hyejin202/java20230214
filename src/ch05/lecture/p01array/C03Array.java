package ch05.lecture.p01array;

public class C03Array {
	public static void main(String[] args) {
		// 배열 만들고 값 항당
		int[] arr1 = new int[3];
		arr1[0] = 9;
		arr1[1] = 3;
		arr1[2] = 7;

		// 배열 만들 때 초기값 생성
		int[] arr2 = new int[] { 99, 33, 77 }; // 길이 명시 필요 x

		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);

		int[] arr3;
		arr3 = new int[] { 10, 20, 30, 40 };

		for (int i = 0; i < 4; i++) {
			System.out.println(arr3[i]);
		}
	}
}
