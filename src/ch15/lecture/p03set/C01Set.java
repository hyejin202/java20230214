package ch15.lecture.p03set;

import java.util.*;

public class C01Set {
	public static void main(String[] args) {
		//set : 순서 없음, 중복 안됨
		Set<Integer> set = new HashSet<>();
		
		// add element 
		set.add(30);
		set.add(90);
		set.add(60);
		set.add(12);
		set.add(90);  //중복 저장 안됨
		
		//size 크기
		int size = set.size();
		System.out.println(size);  //4
		
		// remove 
		set.remove(60);  //객체 명시해 지우면 됨
		System.out.println(set.size());  //3
		System.out.println(set);   //순서(인덱스) 없음
		
		//전체탐색
		//고전적인 for문 인덱스가 없기 때문에 사용할 수 없음
		
		System.out.println("향상된 for ################");
		for(Integer e : set) {
			System.out.println(e);
		}
		
		System.out.println("Iterator $$$$$$$$$$$$$$$$");   //향상된 for문없을때 많이 사용
		Iterator<Integer> iter = set.iterator();           //열거
		while(iter.hasNext()) {                //hasNext 메소드 : 다음에 탐색할게 있는가 (boolean)
			System.out.println(iter.next());   //다음꺼 리턴
		}
		
		System.out.println("forEach %%%%%%%%%%%%%%%%%%%%%%");
		set.forEach(e -> System.out.println(e));
		
		System.out.println("forEach &&&&&&&&&&&&&&&&&&&&&");
		set.forEach(System.out::println);
		
	}
}
