package ch05.lecture.p03Matrix;

public class C03Matrix {
	public static void main(String[] args) {
		int[] arr1 = new int[] { 2, 3, 4, 5 };

		int[][] mat1 = new int[][] {
				new int[] { 3, 4, 5, 6 },
				new int[] { 10, 11, 12, 13 },
				new int[] { 9, 8, 7, 6 }
		};
		// new 연산자 생략(선언, 초기화할 때)
		int[] arr2 = { 2, 3, 4, 5 };
		int[][] mat2 = {
				{ 3, 4, 5, 6 },
				{ 7, 8, 9, 10 },
				{ 10, 11, 12, 13 }
		};
		// 각 행의 배열의 길이가 같지 않아도 됨
		int[][] mat3 = {
				{ 1, 2, 3, 4 },
				{ 10, 20 },
				{ 99, 100, 101 }
		};
	}

}
