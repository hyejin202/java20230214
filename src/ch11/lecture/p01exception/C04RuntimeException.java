package ch11.lecture.p01exception;

import java.util.*;

public class C04RuntimeException {
	public static void main(String[] args) {
		
		var list = new ArrayList<String>();
		list.add("java");
		
		System.out.println(list.get(1));   //IndexOutOfBoundsException  - 실행예외
		
		System.out.println("continue...");
	}
}
