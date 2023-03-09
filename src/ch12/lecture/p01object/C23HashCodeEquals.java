package ch12.lecture.p01object;

import java.util.*;

public class C23HashCodeEquals {
	public static void main(String[] args) {
		//중복없는 원소의 모임(Collection)
		Set set = new HashSet();
		
		System.out.println(set.size());   //0
		
		set.add(100);
		System.out.println(set.size());  //1
		set.add(200);
		System.out.println(set.size());  //2
		//존재하지 않으면 추가
		//이미 있는 원소이므로 안들어감
		set.add(200);
		System.out.println(set.size());  //2
	}
}
