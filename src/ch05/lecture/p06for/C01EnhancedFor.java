package ch05.lecture.p06for;

public class C01EnhancedFor {
	public static void main(String[] args) {
		int[] arr1 = {5,6,10,9,1,2};
		
		for (int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println();
		// enhanced for (향상된 for문), foreach
		for (int n : arr1) {        // for (타입변수 : 배열) - 인덱스 없이 사용
			System.out.println(n);
		}
		
	}
}
