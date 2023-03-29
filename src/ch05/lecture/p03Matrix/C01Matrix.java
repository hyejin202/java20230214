package ch05.lecture.p03Matrix;

public class C01Matrix {
	public static void main(String[] args) {
		// 2차원 배열 (행렬)
		
		int[][] arr = new int[3][];
		
		System.out.println(arr.length);      
		
		arr[0] = new int[] {1, 3, 5, 7};
		arr[1] = new int[] {2, 4, 8, 10};
		arr[2] = new int[] {9, 10, 11, 12};
		
		System.out.println(arr[0][0]);  //1
		System.out.println(arr[1][1]);  //4
		System.out.println(arr[1][2]);  //8
		System.out.println(arr[2][3]);  //12
		
		System.out.println("전체 탐색 for");
		for(int i=0; i<arr.length; i++) {             //arr.length  -> 행의 길이
			for(int j=0; j<arr[i].length; j++) {      //arr[0].length  -> 열의 길이
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
  		
	}
}
