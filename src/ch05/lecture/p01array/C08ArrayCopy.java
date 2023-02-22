package ch05.lecture.p01array;

public class C08ArrayCopy {
	public static void main(String[] args) {
		// 정해진 인덱스 안에서만 사용 가능
		// 처음에 배열의 길이를 설정 - 배열 길이 늘리거나 줄일 수 없음
		
		int[] arr2 = {10,20,30};
		int[] arr3;
		arr3 = new int[arr2.length];   
		
		for (int i=0; i<arr2.length; i++) {
			arr3[i] = arr2[i];   // arr2[i]에 있는 주소를 참조한게 아닌 arr2[i]에 있는 정수값을 할당 
		}
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		
		System.out.println(arr3[0]);
		System.out.println(arr3[1]);
		System.out.println(arr3[2]);
		
		arr2[0] = 100;
		
		System.out.println(arr2[0]);  //100
		System.out.println(arr3[0]);  //10
	}
}
