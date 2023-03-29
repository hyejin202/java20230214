package ch15.sec03.exam03;

import java.util.*;

import javax.swing.*;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("java");
		set.add("JDBC");
		set.add("JSP");
		set.add("Spring");
		
		
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String ele = iter.next();
			System.out.println(ele);
			
			if(ele.equals("JSP")) {
				iter.remove();
			}
		}
		System.out.println();
		
		set.remove("JDBC");
		for(String ele : set) {
			System.out.println(ele);
		}
	}
}
