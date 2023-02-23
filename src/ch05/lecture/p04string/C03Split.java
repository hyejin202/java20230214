package ch05.lecture.p04string;

public class C03Split {
	public static void main(String[] args) {
		// split
		// 특정 문자 패턴으로 문자열을 나누어서 배열로 리턴
		
		String str1 = "hello,java,world,html,css";
		String[] arr1 = str1.split(",");   //string배열로 받아야 함
		
		System.out.println(arr1.length);  //5
		System.out.println(arr1[0]);  
		System.out.println(arr1[4]);
		
		String str2 = "spring reat vue angular jsp sass";
		String[] arr2 = str2.split(" ");
		
		System.out.println(arr2.length);  //6
		System.out.println(arr2[0]);  
		System.out.println(arr2[5]);
		
		String str3 = "I'm ironman";
		String[] arr3 = str3.split("");
		
		System.out.println(arr3.length);
		System.out.println(arr3[0]);  
		System.out.println(arr3[arr3.length - 1]);  //마지막 인덱스
	}
}
