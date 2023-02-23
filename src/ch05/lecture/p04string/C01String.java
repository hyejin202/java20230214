package ch05.lecture.p04string;

public class C01String {
	public static void main(String[] args) {
		// string 참조 타입(주소를 참조)이므로 new연산자와 함께 사용해야 함
		
		String str1;
		String str2;
		String str3;
		
		str1 = new String("hello");
		str2 = new String("hello");
		str3 = str2;
		
		System.out.println(str1 == str2); // false
		System.out.println(str2 == str3); //true, 같은 배열의 주소를 참조
	}
}
