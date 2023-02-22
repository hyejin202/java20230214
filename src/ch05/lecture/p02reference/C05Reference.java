package ch05.lecture.p02reference;

public class C05Reference {
	public static void main(String[] args) {
		int[] arr = {2,4,6};
		
		int[] arr2 = arr;
		
		System.out.println(arr2[0]);  //2
		
		arr = new int[] {2,4,6};   // 새롭게 할당한거
		System.out.println(arr[0]);  //2
		arr[0] = 20;
		System.out.println(arr[0]);  //20
		System.out.println(arr2[0]);  //2
		
	}
}
