package ch13.lecture.p01generic;

import java.util.*;

public class C02Generic {
	public static void main(String[] args) {
		MyClass02<String> o1 = new MyClass02<String>();
		o1.setItem("java");
		
		String s1 = o1.getItem();  //java
		System.out.println(s1.length());  //4
		
		MyClass02<Scanner> o2 = new MyClass02<Scanner>();
		o2.setItem(new Scanner(""));
		Scanner sc = o2.getItem();
		System.out.println(sc.hasNext());
		
		//기본 타입은 타입 아규먼트로 사용 불가하므로
//		MyClass02<int> o3;
		//wrapper type 사용
		MyClass02<Integer> o3 = new MyClass02<Integer>();
		o3.setItem(3);  //autoboxing
		o3.getItem();  //unboxing  , 3
		System.out.println();
		
	}
}
// generic type
// T : type parameter
// type parameter 작성 관습 : 대문자 한 글자
// E-element, k-key, N-number, T-type, V-value, S,U,V etc - 2nd,3rd, 4th,types
class MyClass02<T> {
	private T item;
	
	public T getItem() {
		return item;
	}
	public void setItem(T item) {
		this.item = item;
	}
}
