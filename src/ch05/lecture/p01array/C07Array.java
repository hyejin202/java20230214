package ch05.lecture.p01array;

public class C07Array {
	public static void main(String[] args) {
		int a = 4;
		int b;
		
		b = a;
		System.out.println(a); //4
		System.out.println(b); //4
		
		a = 6;
		
		System.out.println(a); //6
		System.out.println(b); //4
		
		int[] arr1 = {5,6,7};
		int[] arr2;
		arr2 = arr1;   //arr1에 있는 주소를 가리킴
		
		System.out.println(arr1[0]);  // 5
		System.out.println(arr2[0]);  //5
		
		arr1[0] = 50;
		System.out.println(arr1[0]);  //50
		System.out.println(arr2[0]);  //50
		
	}
}
