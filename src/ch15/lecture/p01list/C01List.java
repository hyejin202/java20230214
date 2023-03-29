package ch15.lecture.p01list;

import java.util.*;

public class C01List {
	// java.util.List
	// 순서가 있는 콜렉션(어떤 객체를 담고 있는 객체)
	//List<E> ( E: 담고 있는 객체 클래스)
	//순서 O - 각 아이템(element, 원소)는 index로 접근 가능
	public static void main(String[] args) {
		//새 리스트 만들기
		List<String> list = new ArrayList<String>();
//		List<String> list = new ArrayList<>();
//		var list = new ArrayList<String>();
		
		//element 추가
		list.add("java");
		list.add("css");
		list.add("spring");
		list.add("java");
		
		//element 얻기
		String e1 = list.get(0);
		String e2 = list.get(1);
		String e3 = list.get(2);
		String e4 = list.get(3);
		
		int size = list.size();
		System.out.println(size);
		
		//특정 index의 element 지우기
		list.remove(2);
		System.out.println("지운 후 크기: " + list.size());
		System.out.println("지운 후 리스트: " + list);
		System.out.println("지운 후 2번 인덱스 값 : " + list.get(2));
		
		//특정 인덱스 값 바꾸기
		list.set(2, "react");
		System.out.println(list);
		
		
	}
}


